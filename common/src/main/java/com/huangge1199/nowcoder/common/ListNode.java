package com.huangge1199.nowcoder.common;

import lombok.Data;

/**
 * @author hyy
 * @Classname ListNode
 * @Description TODO
 * @Date 2022/7/26 15:14
 */
@Data
public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
