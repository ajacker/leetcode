import java.util.Collections;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverse = reverseList(slow);
        while(reverse!=null){
            if(head.val!=reverse.val) return false;
            head=head.next;
            reverse=reverse.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode h) {
        ListNode head = h;
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
