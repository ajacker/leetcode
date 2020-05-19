/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    static int[][] dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int[][] generateMatrix(int n) {
        boolean[][] vis = new boolean[n][n];
        int[][] res = new int[n][n];
        int i = 0, j = 0, d = 0, count = 0;
        int[] dir = dirs[d];
        while (count < n * n) {
            res[i][j] = ++count;
            vis[i][j] = true;
            if (!judge(n, i + dir[0], j + dir[1], vis)) {
                d = (d + 1) % 4;
                dir = dirs[d];
            }
            i += dir[0];
            j += dir[1];
        }
        return res;
    }

    public boolean judge(int n, int i, int j, boolean[][] vis) {
        return i >= 0 && i < n && j >= 0 && j < n && !vis[i][j];
    }
}
// @lc code=end
