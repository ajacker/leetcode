/*
 * @lc app=leetcode.cn id=883 lang=java
 *
 * [883] 三维形体投影面积
 */

// @lc code=start
class Solution {
    public int projectionArea(int[][] grid) {
        int s = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxY = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    s++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int maxY = 0;
            for (int j = 0; j < grid[0].length; j++) {
                maxY = Math.max(grid[i][j], maxY);
            }
            s += maxY;
        }
        for (int j = 0; j < grid[0].length; j++) {
            int maxX = 0;
            for (int i = 0; i < grid.length; i++) {
                maxX = Math.max(grid[i][j], maxX);
            }
            s += maxX;
        }
        return s;
    }
}
// @lc code=end
