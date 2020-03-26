/*
 * @lc app=leetcode.cn id=1037 lang=java
 *
 * [1037] 有效的回旋镖
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        int dx = points[1][0] - points[0][0];
        int dy = points[1][1] - points[0][1];
        int ex = points[2][0] - points[0][0];
        int ey = points[2][1] - points[0][1];
        return dx * ey != ex * dy;
    }
}
// @lc code=end
