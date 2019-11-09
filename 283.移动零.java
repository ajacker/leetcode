import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        // 0元素会和正确的非零元素交换
        for (int lastNonZeroElement = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroElement];
                nums[lastNonZeroElement++] = nums[cur];
                nums[cur] = temp;
            }
        }
    }
}
