/*
 * @lc app=leetcode.cn id=892 lang=java
 *
 * [892] 三维形体的表面积
 */

// @lc code=start
class Solution {
    public int surfaceArea(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 先计算每一个位置grid[i][j]上堆叠起来的面积
                if (grid[i][j] > 0) {
                    // 侧面+上下
                    ans += (grid[i][j] * 4 + 2);
                }
                // 再计算grid[i][j],与其东南西北面积(需要判断是否存在)重叠，减去
                if (i - 1 >= 0 && grid[i - 1][j] > 0) {
                    ans -= (Math.min(grid[i - 1][j], grid[i][j]));
                }
                if (i + 1 < n && grid[i + 1][j] > 0) {
                    ans -= (Math.min(grid[i + 1][j], grid[i][j]));
                }
                if (j - 1 >= 0 && grid[i][j - 1] > 0) {
                    ans -= (Math.min(grid[i][j - 1], grid[i][j]));
                }
                if (j + 1 < n && grid[i][j + 1] > 0) {
                    ans -= (Math.min(grid[i][j + 1], grid[i][j]));
                }
            }
        }
        return ans;
    }
}
// @lc code=end
