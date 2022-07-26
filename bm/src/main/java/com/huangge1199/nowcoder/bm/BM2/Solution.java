package com.huangge1199.nowcoder.bm.BM2;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM2 链表内指定区间反转
 * @Date 2022/7/26 15:57
 */
public class Solution {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode cur = head;
        ListNode bef = new ListNode(0);
        bef.next = head;
        ListNode pre = bef;
        int index = 1;
        while (index < n) {
            if (index < m) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode tmp = cur.next;
                cur.next = tmp.next;
                tmp.next = pre.next;
                pre.next = tmp;
            }
            index++;
        }
        return bef.next;
    }
}
