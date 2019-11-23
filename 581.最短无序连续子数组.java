import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        // 第一个不同的位置
        int pos = -1;
        // 到最后之前连续相同的个数
        int same = 0;
        for (int i = 0; i < copy.length; i++) {
            if (nums[i] != copy[i]) {
                if (pos == -1)
                    pos = i;
                same = 0;
            } else if (pos != -1) {
                same++;
            }
        }

        return pos == -1 ? 0 : (copy.length - pos) - same;
    }
}
// @lc code=end
