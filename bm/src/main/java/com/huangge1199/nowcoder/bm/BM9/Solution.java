package com.huangge1199.nowcoder.bm.BM9;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM9 删除链表的倒数第n个节点
 * @Date 2022/8/4 17:06
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write code here
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            if (n == 0) {
                return head.next;
            }
        } else {
            while (fast != null) {
                fast = fast.next;
                if (fast == null) {
                    slow.next = slow.next.next;
                } else {
                    slow = slow.next;
                }
            }
        }
        return head;
    }
}
