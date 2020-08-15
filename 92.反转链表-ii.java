import java.util.Stack;

/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<ListNode> stack = new Stack<>();
        int size = n - m + 1;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;
        ListNode p = null, q = null;
        for (int pos = 0; head != null && pos <= n; pos++) {
            if (pos == m - 1) {
                //记录反转部分前的位置
                p = head;
            }
            if (pos >= m) {
                stack.push(head);
            }
            head = head.next;
        }
        //记录反转部分后的位置
        q = stack.peek().next;
        //开始反转
        while (!stack.isEmpty()) {
            p.next = stack.pop();
            p = p.next;
        }
        //拼接结尾
        p.next = q;
        return pre.next;
    }
}
