/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    int m, n;

    public boolean searchMatrix(int[][] matrix, int target) {
        m = matrix.length;
        if (m == 0) {
            return false;
        }
        n = matrix[0].length;
        int l = 0, r = m * n;
        while (l < r) {
            int mid = (l + r) >>> 1;
            int num = getVal(matrix, mid);
            if (num < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l < m * n && getVal(matrix, l) == target;
    }

    public int getVal(int[][] matrix, int idx) {
        return matrix[idx / n][idx % n];
    }
}
// @lc code=end
