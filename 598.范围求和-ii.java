/*
 * @lc app=leetcode.cn id=598 lang=java
 *
 * [598] 范围求和 II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int length = n, height = m;
        //最小操作半径一定被操作了最多次
        for (int t = 0; t < ops.length; t++) {
            int a = ops[t][0];
            int b = ops[t][1];
            height = Integer.min(a, height);
            length = Integer.min(b, length);

        }
        return height * length;

    }
}
// @lc code=end
