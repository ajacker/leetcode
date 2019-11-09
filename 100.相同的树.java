import java.util.Stack;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;
        Stack<TreeNode> stackp = new Stack<>();
        stackp.push(p);
        Stack<TreeNode> stackq = new Stack<>();
        stackq.push(q);
        StringBuilder sbp = new StringBuilder();
        StringBuilder sbq = new StringBuilder();
        while(!stackp.empty()){
            p = stackp.pop();
            if(p==null){
                sbp.append("null");
                continue;
            }else{
                sbp.append(p.val);
            }
            stackp.push(p.left);
            stackp.push(p.right);
        }
        while(!stackq.empty()){
            q = stackq.pop();
            if(q==null){
                sbq.append("null");
                continue;
            }else{
                sbq.append(q.val);
            }
            stackq.push(q.left);
            stackq.push(q.right);
        }
        return sbp.toString().equals(sbq.toString());

    }

}
