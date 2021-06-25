package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;

import java.util.List;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class A0019_removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (n == 0) return head;
        int space = 0;
        ListNode l = head;
        ListNode r = head;
        while (r.next != null) {
            if (space != n) {
                space++;
            } else {
                l = l.next;
            }
            r = r.next;
        }
        if (space < n) {
            head = head.next;
        }
        if (space == n) {
            ListNode t = l.next.next;
            l.next.next = null;
            l.next = t;
        }
        return head;
    }

}
