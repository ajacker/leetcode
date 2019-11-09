/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int sum) {
        return myPathSum(root, sum, false);
    }
    /**
     * 递归函数
     * @param root 根节点
     * @param sum 目标和
     * @param selected 上一层节点如果被选中，那么这一层节点也必须选中
     * @return 有多少路径满足目标和
     */
    public int myPathSum(TreeNode root,int sum,boolean selected){
        if(root==null) return 0;
        int result = 0;
        if(root.val==sum) result+=1;
        if(root.left!=null){
            if(!selected) result+=myPathSum(root.left, sum,false);
            result+=myPathSum(root.left, sum-root.val,true);
        }
        if(root.right!=null){
            if(!selected)  result+=myPathSum(root.right, sum,false);
            result+=myPathSum(root.right, sum-root.val,true);
        }
        return result;
    }
}

