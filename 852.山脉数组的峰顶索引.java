/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] < A[i]) {
                return i;
            }
        }
        return A.length;
    }
}
// @lc code=end
