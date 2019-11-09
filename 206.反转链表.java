/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while(head!=null){
            result = insertFront(result,head.val);
            head = head.next;
        }
        return result;
    }
    public ListNode insertFront(ListNode head,int val){
        ListNode h = new ListNode(val);
        h.next = head;
        return h;
    }
}

