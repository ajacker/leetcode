/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = null;
        if (t1 != null || t2 != null) {
            if (t1 != null && t2 != null) {
                root = t1;
                root.val += t2.val;
                root.left = mergeTrees(t1.left,t2.left);
                root.right = mergeTrees(t1.right,t2.right);
            }else if(t1!=null){
                root = t1;
            }else{
                root = t2;
            }
        }
        return root;
    }
}
// @lc code=end
