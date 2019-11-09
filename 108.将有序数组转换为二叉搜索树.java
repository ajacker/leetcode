/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums==null?null:solve(nums, 0, nums.length);
    }
    public TreeNode solve(int[] nums,int start,int end){
        if(start == end) return null;
        int mid = (start+end)/2;
        TreeNode m = new TreeNode(nums[mid]);
        m.left = solve(nums, start, mid);
        m.right = solve(nums, mid+1, end);
        return m;
    }
}

