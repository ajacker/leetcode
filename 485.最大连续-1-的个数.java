/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count = 0;
            }else{
                max = Integer.max(max,++count);
            }
        }
        return max;
    }
}
// @lc code=end

