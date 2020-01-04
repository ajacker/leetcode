
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    static PriorityQueue<Integer> queue;
    static HashSet<Integer> set;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;
        queue = new PriorityQueue<>();
        set = new HashSet<>();
        preOrder(root);
        queue.poll();
        return queue.isEmpty() ? -1 : queue.poll();
    }

    public void preOrder(TreeNode node) {
        if (!set.contains(node.val)) {
            queue.offer(node.val);
            set.add(node.val);
        }
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }
}
// @lc code=end
