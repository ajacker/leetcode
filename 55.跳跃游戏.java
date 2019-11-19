/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
public class Solution {
    public boolean canJump(int[] nums) {
        //从右往左走。看看能不能跳到最后一个位置
        //如果b能够跳到终点，a能跳到b，则a也能跳到终点
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}

// @lc code=end
