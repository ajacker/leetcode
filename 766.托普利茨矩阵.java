/*
 * @lc app=leetcode.cn id=766 lang=java
 *
 * [766] 托普利茨矩阵
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0; i < N; i++) {
            int num = matrix[0][i];
            for (int a = 0, b = i; a < M && b < N; a++, b++) {
                if (matrix[a][b] != num) {
                    return false;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            int num = matrix[i][0];
            for (int a = i, b = 0; a < M && b < N; a++, b++) {
                if (matrix[a][b] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end
