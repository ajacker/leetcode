/*
 * @lc app=leetcode.cn id=867 lang=java
 *
 * [867] 转置矩阵
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] A) {
        int height = A.length;
        int len = A[0].length;
        int[][] B = new int[len][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < len; j++) {
                B[j][i]=A[i][j];
            }
        }
        return B;
    }
}
// @lc code=end

