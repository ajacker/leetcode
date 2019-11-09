/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return fun(root,false);
       
    }
    public int fun(TreeNode node,boolean isLeft){
        int left = 0,right=0;
        if(node.left==null&&node.right==null&&isLeft) return node.val; 
        if(node.left!=null) left = fun(node.left,true);
        if(node.right!=null) right = fun(node.right,false);
        return left+right;
    }
}

