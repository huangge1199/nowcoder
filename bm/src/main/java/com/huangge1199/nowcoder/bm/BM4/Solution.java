package com.huangge1199.nowcoder.bm.BM4;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM4 合并两个排序的链表
 * @Date 2022/7/26 16:19
 */
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode head = list;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return list.next;
    }
}
