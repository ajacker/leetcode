/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1, temp = 1;
        if(nums.length == 0) return 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                temp++;
            }else{
                ans = Math.max(temp, ans);
                temp = 1;
            }
        }
        ans = Math.max(temp, ans);
        return ans;
    }
}
// @lc code=end

