package com.huangge1199.nowcoder.bm.BM3;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM3 链表中的节点每k个一组翻转
 * @Date 2022/7/26 16:12
 */
public class Solution {
    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        ListNode cur = head;
        ListNode pre = null;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        for (int i = 0; i < k; i++) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        head.next = reverseKGroup(tail, k);
        return pre;
    }
}
