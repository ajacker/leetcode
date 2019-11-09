import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        queue.add(root);
        int lastAmount = 1;
        int newAmount = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll(); 
            temp.add(node.val);
            if(node.left != null){
                queue.add(node.left);
                newAmount++;
            }
            if(node.right != null){
                queue.add(node.right);
                newAmount++;
            }
            if(--lastAmount == 0) {
                List<Integer> t= new ArrayList<Integer>(temp);
                result.addFirst(t);
                temp.clear();
                lastAmount = newAmount;
                newAmount = 0;
            }
        }
        return result;
    }
}

