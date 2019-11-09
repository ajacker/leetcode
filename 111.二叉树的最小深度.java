import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if (root.left == null)
            if(root.right == null)
                return 1;
            else
                return 1 + minDepth(root.right);
        else
            if(root.right == null)
                return 1 + minDepth(root.left);
            else
                return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

