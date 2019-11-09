/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode p = head;
        ListNode q = p.next;
        while (q != null) {
            if (p.val == q.val) {
                if (q.next == null) {
                    p.next = null;
                    break;
                } else {
                    p.next = q.next;
                }
            }else{
                p = p.next;
            }
            q = p.next;
        }
        return head;
    }

}
