/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        //转置
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                matrix[i][j] ^= matrix[len - 1 - j][len - 1 - i];
                matrix[len - 1 - j][len - 1 - i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[len - 1 - j][len - 1 - i];
            }
        }
        //每一列上下颠倒
        for (int i = 0; i < len; i++) {
            int top = 0, end = len - 1;
            //将这一列上下颠倒
            while (top < end) {
                matrix[top][i] ^= matrix[end][i];
                matrix[end][i] ^= matrix[top][i];
                matrix[top++][i] ^= matrix[end--][i];
            }
        }
    }
}
// @lc code=end
