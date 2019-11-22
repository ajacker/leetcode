import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int type = 0;
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            int cur = candies[i];
            if (last != cur) {
                type++;
            }
            last = cur;
        }
        int len = candies.length;
        return Integer.min(len/2, type);
    }
}
// @lc code=end
