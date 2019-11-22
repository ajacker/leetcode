/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //个递归判断是否有相等的部分
        if (equals(s, t)) {
            return true;
        } else {
            if (s == null) {
                return t == null;
            }
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
    /**
     * 判断两棵树是否相等
     * @param s
     * @param t
     * @return
     */
    public boolean equals(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            if (s.val != t.val) {
                return false;
            } else {
                return equals(s.left, t.left) && equals(s.right, t.right);
            }
        } else {
            return s == t;
        }
    }
}
// @lc code=end
