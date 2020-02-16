import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        dfs(root1, l1);
        dfs(root2, l2);
        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i) != l2.get(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void dfs(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                res.add(root.val);
            }
            dfs(root.left, res);
            dfs(root.right, res);
        }
    }
}
// @lc code=end
