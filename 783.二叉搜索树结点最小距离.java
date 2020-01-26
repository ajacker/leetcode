/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树结点最小距离
 */

// @lc code=start
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
    Integer prev, ans;
    public int minDiffInBST(TreeNode root) {
        prev = null;
        ans = Integer.MAX_VALUE;
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null)
            ans = Math.min(ans, node.val - prev);
        prev = node.val;
        inOrder(node.right);
    }
}
// @lc code=end

