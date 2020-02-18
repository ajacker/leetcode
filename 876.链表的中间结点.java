/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2.next != null && l2.next.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return l2.next == null ? l1 : l1.next;
    }
}
// @lc code=end
