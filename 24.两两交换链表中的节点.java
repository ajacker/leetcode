/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode top = new ListNode(-1);
        top.next = head;
        ListNode h = top;
        ListNode p = h.next;
        ListNode q = p.next;
        outer: while (true) {
            if (p == null | q == null) {
                break;
            }
            // 交换p，q
            p.next = q.next;
            h.next = q;
            q.next = p;
            // p，q交换后指针顺序反了，需要换回来
            ListNode t = p;
            p = q;
            q = t;
            // 前进两步
            for (int i = 0; i < 2; i++) {
                h = h.next;
                if (h.next == null) {
                    // 走到头了不能交换了
                    break outer;
                }
                p = h.next;
                q = p.next;
            }
        }
        return top.next;
    }
}
// @lc code=end
