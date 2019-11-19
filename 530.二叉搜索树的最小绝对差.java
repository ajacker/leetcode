/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
 */

// @lc code=start
/**
 * Definition for a binary tree node. 
 * public class TreeNode { 
 * int val; 
 * TreeNode left; 
 * TreeNode right; 
 * TreeNode(int x) { val = x; } 
 * }
 */
class Solution {
    int min = Integer.MAX_VALUE;
    int last = -1;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }
    /**
     * 中序遍历
     * @param root 根节点
     */
    public void inOrder(TreeNode root) {
        if (root.left != null) {
            inOrder(root.left);
        }
        if(last!=-1){
            min = Integer.min(root.val - last, min);
        }
        last = root.val;
        if (root.right != null) {
            inOrder(root.right);
        }
    }
}
// @lc code=end
