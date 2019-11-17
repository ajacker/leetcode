import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    ArrayList<Integer> list;
    TreeNode pre = null;
    int maxTimes;
    int thisTimes;

    public int[] findMode(TreeNode root) {
        if (root == null)
            return new int[0];
        list = new ArrayList<>();
        inOrder(root);
        int length = list.size();
        int[] rr = new int[length];
        for (int i = 0; i < length; i++) {
            rr[i] = list.get(i);
        }

        return rr;
    }

    public void inOrder(TreeNode t) {
        if (t.left != null) {
            inOrder(t.left);
        }
        if (pre != null && pre.val == t.val) {
            thisTimes++;
        } else {
            thisTimes = 1;
        }
        if (thisTimes == maxTimes) {
            list.add(t.val);
        } else if (thisTimes > maxTimes) {
            maxTimes = thisTimes;
            list.clear();
            list.add(t.val);
        }
        pre = t;
        if (t.right != null) {
            inOrder(t.right);
        }
    }
}
// @lc code=end
