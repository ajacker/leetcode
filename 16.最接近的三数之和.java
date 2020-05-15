import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        boolean flag = false;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                } else if (sum > target) {
                    // 大了就减少k指针，让它指向的数字变小
                    k--;
                } else {
                    // 小了就增大j指针，让它指向的数字变大
                    j++;
                }
                // 更新最接近的值
                if (!flag || Math.abs(sum - target) < Math.abs(res - target)) {
                    flag = true;
                    res = sum;
                }
            }
        }
        return res;
    }
}
// @lc code=end
