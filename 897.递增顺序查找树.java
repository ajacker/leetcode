/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序查找树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    static TreeNode ans, last;

    public TreeNode increasingBST(TreeNode root) {
        ans = null;
        inOreder(root);
        return ans;
    }

    public void inOreder(TreeNode root) {
        if (root != null) {
            inOreder(root.left);
            if (ans == null) {
                ans = new TreeNode(root.val);
                last = ans;
            } else {
                last.right = new TreeNode(root.val);
                last = last.right;
            }
            inOreder(root.right);
        }
    }
}
// @lc code=end
