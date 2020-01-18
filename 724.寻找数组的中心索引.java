/*
* @lc app=leetcode.cn id=724 lang=java
*
* [724] 寻找数组的中心索引
*/

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            sum[i] = i - 1 >= 0 ? sum[i - 1] + cur : cur;
        }
        for (int i = 0; i < nums.length; i++) {
            int left = i >= 1 ? sum[i - 1] : 0;
            int right = sum[nums.length - 1] - sum[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
