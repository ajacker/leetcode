/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 求前缀和
        long[] preSum = new long[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i <= preSum.length - k; i++) {
            long temp = i == 0 ? preSum[i + k - 1] : preSum[i + k - 1] - preSum[i - 1];
            max = Math.max(max, temp);
        }
        return max / (double) k;
    }
}
// @lc code=end
