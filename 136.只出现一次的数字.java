/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length ; i++) 
            nums[0] ^= nums[i];
        return nums[0];
    }
}

