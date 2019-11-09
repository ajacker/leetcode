import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */
class Solution {
    public int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
