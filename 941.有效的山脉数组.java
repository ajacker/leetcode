/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        boolean up = true;
        for (int i = 1; i < A.length; i++) {
            if (up == false) {
                if (A[i] > A[i - 1]) {
                    return false;
                } else if (A[i] == A[i - 1]) {
                    return false;
                }
            } else {
                if (A[i] < A[i - 1]) {
                    up = false;
                    if (i == 1) {
                        return false;
                    }
                } else if (A[i] == A[i - 1]) {
                    return false;
                }
            }
        }
        return !up;
    }
}
// @lc code=end
