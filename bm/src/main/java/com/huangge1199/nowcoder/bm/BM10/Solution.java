package com.huangge1199.nowcoder.bm.BM10;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM10 两个链表的第一个公共结点
 * @Date 2022/8/4 17:19
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int cnt = 0;
        ListNode n1 = pHead1;
        ListNode n2 = pHead2;
        while (n1 != null && n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        if (n1 == null && n2 != null) {
            while (n2 != null) {
                cnt++;
                n2 = n2.next;
            }
            n2 = pHead2;
            for (int i = 0; i < cnt; i++) {
                n2 = n2.next;
            }
            n1 = pHead1;
        } else if (n1 != null && n2 == null) {
            while (n1 != null) {
                cnt++;
                n1 = n1.next;
            }
            n1 = pHead1;
            for (int i = 0; i < cnt; i++) {
                n1 = n1.next;
            }
            n2 = pHead2;
        } else {
            n1 = pHead1;
            n2 = pHead2;
        }
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }
}
