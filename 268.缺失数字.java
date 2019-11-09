/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
