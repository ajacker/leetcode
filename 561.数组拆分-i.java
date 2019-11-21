import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * @lc app=leetcode.cn id=561 lang=java
 *
 * [561] 数组拆分 I
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        return IntStream.iterate(0, i->i+2).limit(nums.length/2).map(i->nums[i]).sum();
    }
}
// @lc code=end

