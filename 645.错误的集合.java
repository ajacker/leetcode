/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] existed = new boolean[nums.length + 1];
        int wrong = 0, excepted = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!existed[nums[i]]) {
                existed[nums[i]] = true;
            } else {
                wrong = nums[i];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!existed[i]) {
                excepted = i;
                break;
            }
        }
        return new int[] { wrong, excepted };
    }
}
// @lc code=end
