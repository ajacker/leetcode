import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    static int[][] dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) {
            return res;
        }
        int n = matrix[0].length;
        boolean[][] vis = new boolean[m][n];
        int i = 0, j = 0, count = 0, d = 0;
        int[] dir = dirs[d];
        while (count < m * n) {
            res.add(matrix[i][j]);
            vis[i][j] = true;
            count++;
            if (!judge(m, n, i + dir[0], j + dir[1], vis)) {
                d = (d + 1) % 4;
                dir = dirs[d];
            }
            i += dir[0];
            j += dir[1];
        }
        return res;
    }

    public boolean judge(int m, int n, int i, int j, boolean[][] vis) {
        return i >= 0 && i < m && j >= 0 && j < n && !vis[i][j];
    }

}
// @lc code=end
