/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (n != nums[i - 1]) {
                count = 0;
            }
            if (count < 2) {
                count++;
                nums[p++] = n;
            }
        }
        return p;
    }
}
// @lc code=end
