import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 保证选定的数字不重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    // 满足条件，添加结果
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
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
                } else if (sum > 0) {
                    // 大了就减少k指针，让它指向的数字变小
                    k--;
                } else {
                    // 小了就增大j指针，让它指向的数字变大
                    j++;
                }
            }
        }
        return res;
    }

}
// @lc code=end
