import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    static ArrayList<Info> temp;

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return new ArrayList<Double>();
        }
        temp = new ArrayList<>();
        preOrder(root, 0);
        ArrayList<Double> res = new ArrayList<>();
        for (Info info : temp) {
            res.add(info.sum / info.count);
        }
        return res;
    }

    public static void preOrder(TreeNode node, int depth) {
        if (temp.size() <= depth) {
            temp.add(new Info());
        }
        temp.get(depth).add(node.val);
        if (node.left != null) {
            preOrder(node.left, depth + 1);
        }
        if (node.right != null) {
            preOrder(node.right, depth + 1);
        }
    }

    static class Info {
        double sum;
        int count;

        void add(int n) {
            sum += n;
            count++;
        }
    }
}
// @lc code=end
