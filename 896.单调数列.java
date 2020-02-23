/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length > 1) {
            int flag = 0;
            for (int i = 1; i < A.length; i++) {
                if (flag == 0) {
                    if (A[i] != A[i - 1]) {
                        flag = A[i] > A[i - 1] ? 1 : -1;
                    }
                } else {
                    if (flag == 1 && A[i] < A[i - 1]) {
                        return false;
                    } else if (flag == -1 && A[i] > A[i - 1]) {
                        return false;
                    }
                }
            }
            return true;
        } else
            return true;

    }
}
// @lc code=end
