package com.huangge1199.nowcoder.bm.BM7;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM7 链表中环的入口结点
 * @Date 2022/8/4 16:33
 */
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null) {
            return null;
        } else {
            fast = pHead;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
