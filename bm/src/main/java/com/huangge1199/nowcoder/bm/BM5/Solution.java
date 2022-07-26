package com.huangge1199.nowcoder.bm.BM5;

import com.huangge1199.nowcoder.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author hyy
 * @Classname Solution
 * @Description BM5 合并k个已排序的链表
 * @Date 2022/7/26 16:32
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        ListNode list = new ListNode(0);
        ListNode head = list;
        for (ListNode tmp : lists) {
            if (tmp != null) {
                pq.add(tmp);
            }
        }
        while (!pq.isEmpty()) {
            head.next = pq.poll();
            head = head.next;
            while (head.next == null && !pq.isEmpty()) {
                head.next = pq.poll();
                head = head.next;
            }
            if (head.next != null) {
                pq.add(head.next);
            }
        }
        return list.next;
    }
}
