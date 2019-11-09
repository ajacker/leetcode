/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return pathSum(root,0,sum);
    }
    public boolean pathSum(TreeNode root,int prev,int sum){
        if(root == null) return false;
        int current = root.val + prev;
        if(current == sum && root.left == root.right && root.left == null) return true;
        return pathSum(root.left,current,sum)||pathSum(root.right,current,sum);

    }
}

