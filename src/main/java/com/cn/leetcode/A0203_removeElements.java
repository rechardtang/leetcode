package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;

/**
 * 203. 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 示例 2：
 * <p>
 * 输入：head = [], val = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 列表中的节点数目在范围 [0, 104] 内
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 */
public class A0203_removeElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode ptr = head, prev = head;
        while (ptr != null) {
            if (ptr.val == val) {
                if (prev == ptr) {
                    head = ptr.next;
                    ptr.next = null;
                    ptr = head;
                    prev = head;
                    continue;
                }else{
                    prev.next = ptr.next;
                    ptr.next = null;
                }
            } else {
                prev = ptr;
            }
            ptr = prev.next;
        }
        return head;
    }

}
