/*
 * @lc app=leetcode.cn id=558 lang=java
 *
 * [558] 四叉树交集
 */

// @lc code=start
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf && quadTree2.isLeaf) {
            return new Node(quadTree1.val || quadTree2.val, true, null, null, null, null);
        } else {
            if (!quadTree1.isLeaf && !quadTree2.isLeaf) {
                Node res = new Node();
                res.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
                res.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
                res.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
                res.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
                // 合并
                if (res.topLeft.isLeaf && res.topRight.isLeaf && res.bottomLeft.isLeaf && res.bottomRight.isLeaf) {
                    boolean tag = res.topLeft.val;
                    if (tag == res.topRight.val && tag == res.bottomLeft.val && tag == res.bottomRight.val) {
                        res.isLeaf = true;
                        res.val =tag;
                        res.topLeft = res.topRight = res.bottomLeft = res.bottomRight = null;
                    }
                }
                return res;
            } else {
                // 如果一个是叶子节点，那么或以后的结果就是可以判断为某一个
                if (quadTree1.isLeaf) {
                    if (quadTree1.val) {
                        return quadTree1;
                    } else {
                        return quadTree2;
                    }
                } else {
                    if (quadTree2.val) {
                        return quadTree2;
                    } else {
                        return quadTree1;
                    }
                }
            }
        }

    }

}
// @lc code=end
