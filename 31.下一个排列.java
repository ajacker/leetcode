/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        // 特判
        if (nums == null || nums.length == 0) {
            return;
        }
        int firstIndex = -1;
        // 从后往前找到一对升序的元素，也就是它后面都是降序
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstIndex = i;
                break;
            }
        }
        // 如果没找到代表没有下一个排列了，反转数组
        if (firstIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        //从后往前找到第一个比它大的元素，就是刚好比它大的元素
        int secondIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[firstIndex]) {
                secondIndex = i;
                break;
            }
        }
        //交换，交换后依然是降序
        swap(nums, firstIndex, secondIndex);
        //将firstIndex后的元素反转（从降序换成升序）
        reverse(nums, firstIndex + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end
