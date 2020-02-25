import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] A) {
        return Arrays.stream(A).boxed().sorted((a, b) -> a % 2 - b % 2).mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end
