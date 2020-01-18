/*
 * @lc app=leetcode.cn id=747 lang=java
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, other = -1;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > other) {
                other = cur;
            }
            if (other > max) {
                int temp = other;
                other = max;
                max = temp;
                res = i;
            }
        }
        return 2 * other <= max ? res : -1;
    }
}
// @lc code=end
