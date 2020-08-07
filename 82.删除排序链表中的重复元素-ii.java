/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = new ListNode(-1);
        ListNode p = root, q = head;
        root.next = head;
        while (q != null && q.next != null) {
            p.next = q;
            if (q.val == q.next.val) {
                //出现重复的就删除这个数字，因为有序所以相同的数字连续出现
                int delVal = q.val;
                while (q != null && q.val == delVal) {
                    p.next = q.next;
                    q = p.next;
                }
            } else if (q != null) {
                q = q.next;
                p = p.next;
            }
        }
        return root.next;
    }
}
// @lc code=end
