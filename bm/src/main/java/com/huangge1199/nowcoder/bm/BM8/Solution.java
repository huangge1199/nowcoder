package com.huangge1199.nowcoder.bm.BM8;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM8 链表中倒数最后k个结点
 * @Date 2022/8/4 16:46
 */
public class Solution {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        if (fast == null && k > 0) {
            return null;
        } else {
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
