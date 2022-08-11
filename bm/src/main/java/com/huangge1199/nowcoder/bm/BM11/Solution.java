package com.huangge1199.nowcoder.bm.BM11;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM11 链表相加(二)
 * @Date 2022/8/11 10:12
 */
public class Solution {
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        head1 = revert(head1);
        head2 = revert(head2);
        ListNode head = new ListNode(0);
        ListNode node = head;
        boolean bl = false;
        while (head1 != null || head2 != null || bl) {
            int sum = (head1 == null ? 0 : head1.val)
                    + (head2 == null ? 0 : head2.val)
                    + (bl ? 1 : 0);
            bl = sum >= 10;
            sum %= 10;
            node.next = new ListNode(sum);
            node = node.next;
            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }
        if (head1 == null && head2 != null) {
            node.next = head2;
        } else if (head1 != null && head2 == null) {
            node.next = head1;
        }
        head = head.next;
        return revert(head);
    }

    private ListNode revert(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
