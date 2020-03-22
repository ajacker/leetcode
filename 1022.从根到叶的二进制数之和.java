/*
 * @lc app=leetcode.cn id=1022 lang=java
 *
 * [1022] 从根到叶的二进制数之和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    static int sum;
    static StringBuilder sb;

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sum = 0;
        sb = new StringBuilder();
        dfs(root);
        return sum;
    }

    public void dfs(TreeNode root) {
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString(), 2);
        } else {
            if (root.left != null) {
                dfs(root.left);
            }
            if (root.right != null) {
                dfs(root.right);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
// @lc code=end
