/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            // 保证选定的数字不重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int m = i + 1; m < nums.length - 2; m++) {
                // 保证选定的数字不重复
                if (m > i + 1 && nums[m] == nums[m - 1]) {
                    continue;
                }
                int j = m + 1, k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[m] + nums[j] + nums[k];
                    if (sum == target) {
                        // 满足条件，添加结果
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[m], nums[j], nums[k]));
                        res.add(temp);
                        k--;
                        j++;
                        // 跳过重复的
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (sum > target) {
                        // 大了就减少k指针，让它指向的数字变小
                        k--;
                    } else {
                        // 小了就增大j指针，让它指向的数字变大
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end
