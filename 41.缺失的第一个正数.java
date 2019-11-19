/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            // 用while因为换过来的元素不一定放对位置了
            // 限制范围1-length因为超出这个范围的没必要排序
            // 限制nums[nums[i] - 1] != nums[i]代表如果两个数字相同就不交换，免得陷入死循环
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                //用p存着因为nums[i]在交换过程中会发生改变（也可通过改变交换次序来解决）
                int p = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
            }
        }
        // 找到第一个位置不对的元素返回
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // 如果位置都对了那么就返回下一个应该的元素
        return nums.length + 1;
    }
}
// @lc code=end
