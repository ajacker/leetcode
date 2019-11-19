import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=532 lang=java
 *
 * [532] 数组中的K-diff数对
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;
        //diff中保存diff对中小的那个
        HashSet<Integer> diff = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //检查之前遍历过的是否包含对
            if (visited.contains(nums[i] - k)) {
                diff.add(nums[i] - k);
            }
            if (visited.contains(nums[i] + k)) {
                diff.add(nums[i]);
            }
            visited.add(nums[i]);
        }
        return diff.size();
    }
}
// @lc code=end
