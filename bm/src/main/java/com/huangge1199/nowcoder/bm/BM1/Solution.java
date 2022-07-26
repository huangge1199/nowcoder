package com.huangge1199.nowcoder.bm.BM1;

import com.huangge1199.nowcoder.common.ListNode;

/**
 * @author hyy
 * @Classname Solution
 * @Description TODO
 * @Date 2022/7/26 15:08
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
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
