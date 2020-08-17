/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    Integer pre = null;
    boolean res = true;

    public boolean isValidBST(TreeNode root) {
        if (root == null || !res) {
            return true;
        } else if (!res) {
            return false;
        }
        res = res && isValidBST(root.left);
        if (pre != null && root.val <= pre) {
            return false;
        } else {
            pre = root.val;
        }
        res = res && isValidBST(root.right);
        return res;
    }

}
// @lc code=end
