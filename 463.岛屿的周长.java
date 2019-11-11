/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int islandPerimeter(int[][] grid) {
        int res = 0;
        int height = grid.length;
        if (height == 0) {
            return res;
        }
        int length = grid[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] == 0) {
                    // 跳过水域
                    continue;
                } else {
                    for (int p = 0; p < 4; p++) {
                        // 得到相邻的坐标
                        int x = i + dirs[p][0];
                        int y = j + dirs[p][1];
                        if (x >= 0 && x < height && y >= 0 && y < length) {
                            // 如果是水域的话，周长增加
                            res += grid[x][y] ^ 1;
                        } else {
                            // 如果到达边界，周长增加
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end
