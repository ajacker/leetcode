/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode t = h;
        ListNode p = h.next;
        ListNode q = h.next;
        while (p.next != null) {
            p = p.next;
            if (--n <= 0) {
                t = t.next;
                q = q.next;
            }
        }
        t.next = q.next;
        return h.next;
    }
}
// @lc code=end
