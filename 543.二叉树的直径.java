/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return max;
    }

    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depthLeft = getDepth(root.left);
        int depthRight = getDepth(root.right);
        //在查找的过程中不断更新路径最长长度
        max = Integer.max(max, depthLeft + depthRight);
        return Integer.max(depthLeft, depthRight) + 1;
    }
}
// @lc code=end
