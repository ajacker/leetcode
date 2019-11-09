import java.util.*;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        int currentNum = 0;
        int prevNum = 1;
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        List<Integer> current = new ArrayList<>();
        Queue<Node> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()) {
            Node node = list.poll();
            current.add(node.val);
            prevNum--;
            List<Node> children = node.children;
            children.stream().forEach(n -> list.offer(n));
            currentNum += children.size();
            if (prevNum == 0) {
                prevNum = currentNum;
                currentNum = 0;
                result.add(current);
                current = new ArrayList<>();
            }
        }
        return result;
    }
}
