import java.util.List;

/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N叉树的最大深度
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
// @lc code=start
/*
 * // Definition for a Node. class Node { public int val; public List<Node>
 * children;
 * 
 * public Node() {}
 * 
 * public Node(int _val) { val = _val; }
 * 
 * public Node(int _val, List<Node> _children) { val = _val; children =
 * _children; } };
 */

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.isEmpty()) {
            return 1;
        }
        List<Node> childs = root.children;
        return childs.stream().mapToInt(i -> maxDepth(i) + 1).max().orElse(0);
    }
}
// @lc code=end
