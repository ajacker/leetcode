import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            int pos = nums.length - Arrays.binarySearch(sorted, nums[i]);
            switch (pos) {
            case 1:
                result[i] = "Gold Medal";
                break;
            case 2:
                result[i] = "Silver Medal";
                break;
            case 3:
                result[i] = "Bronze Medal";
                break;
            default:
                result[i] = String.valueOf(pos);
                break;
            }
        }
        return result;
    }
}
// @lc code=end
