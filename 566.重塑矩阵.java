/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row == 0 || col == 0 || row * col != r * c)
            return nums;
        int[][] result = new int[r][c];
        int count = 0;
        int i = 0, j = 0, p = 0, q = 0;
        while (count < r * c) {
            result[p][q] = nums[i][j];
            p = p + (q + 1) / c;
            q = (q + 1) % c;
            i = i + (j + 1) / col;
            j = (j + 1) % col;
            count++;
        }
        return result;
    }
}
// @lc code=end
