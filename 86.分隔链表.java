/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(-1);
        ListNode h2 = new ListNode(-1);
        ListNode p = h1, q = h2;
        while (head != null) {
            if (head.val < x) {
                p.next = head;
                p = p.next;
            } else {
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }
        q.next = null;
        p.next = h2.next;
        return h1.next;
    }
}
// @lc code=end
