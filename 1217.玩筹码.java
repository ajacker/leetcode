/*
 * @lc app=leetcode.cn id=1217 lang=java
 *
 * [1217] 玩筹码
 */

// @lc code=start
class Solution {
    public int minCostToMoveChips(int[] chips) {
        // 其实就是求min(奇数，偶数)
        int num1 = 0, num2 = 0;
        for (int i = 0; i < chips.length; i++) {
            if (chips[i] % 2 == 1) {
                num1++;
            } else {
                num2++;
            }
        }
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }

    }
}
// @lc code=end
