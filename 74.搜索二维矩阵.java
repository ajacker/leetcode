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
        int res = binarySearch(matrix, target, 0, m * n);
        System.out.println(res);
        return res != -1;
    }

    public int binarySearch(int[][] matrix, int target, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            int num = getVal(matrix, mid);
            if (num == target) {
                return mid;
            } else if (num < target) {
                return binarySearch(matrix, target, mid + 1, r);
            } else {
                return binarySearch(matrix, target, l, mid);
            }
        }
        return -1;
    }

    public int getVal(int[][] matrix, int idx) {
        return matrix[idx / n][idx % n];
    }
}
// @lc code=end
