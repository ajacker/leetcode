/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        boolean result=isBalance(root);
        if(root.left != null ) result = result && isBalanced(root.left);
        if(root.right != null) result = result && isBalanced(root.right);
        return result;
    }
    public boolean isBalance(TreeNode root){
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1;
    }
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == root.right && root.left == null)
            return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

