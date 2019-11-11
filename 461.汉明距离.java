/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int dis = 0;
        while (x != 0 || y != 0) {
            // 取出每一位
            int a = x & 1;
            int b = y & 1;
            // 如果不一样位，异或为1
            dis += a ^ b;
            x >>>= 1;
            y >>>= 1;
        }
        return dis;
    }
}
// @lc code=end
