/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    static int v = 0;

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        v = root.val;
        return dfs(root);
    }

    public boolean dfs(TreeNode root) {
        boolean flag = true;
        if (root.val != v) {
            return false;
        }
        if (root.left != null) {
            flag = flag & dfs(root.left);
        }
        if (root.right != null) {
            flag = flag & dfs(root.right);
        }
        return flag;
    }
}
// @lc code=end
