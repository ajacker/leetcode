/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        while (head != null && head.val == val)
            head = head.next;
        ListNode p = head;
        ListNode q = head;
        while (q != null) {
            q = p.next;
            while (q != null && q.val == val) {
                p.next = q.next;
                q = p.next;
            }
            p = p.next;
        }
        return head;
    }
}
