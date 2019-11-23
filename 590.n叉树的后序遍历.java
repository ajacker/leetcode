import java.util.List;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null)
            return result;
        postOrder(root);
        return result;
    }

    public void postOrder(Node root) {
        if (!root.children.isEmpty()) {
            for (Node child : root.children) {
                postOrder(child);
            }
        }
        result.add(root.val);
    }
}
// @lc code=end
