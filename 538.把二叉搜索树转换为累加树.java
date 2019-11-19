/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        inOrder(root);
        return root;
    }
    /**
     * 遍历右-中-左，序列从大到小（左边的都小于右边的）
     * 加上所有比它大的就是加上右边所有的
     * @param root
     */
    public void inOrder(TreeNode root) {
        if (root.right != null) {
            inOrder(root.right);
        }
        sum += root.val;
        root.val = sum;
        if (root.left != null) {
            inOrder(root.left);
        }
    }
}
// @lc code=end
