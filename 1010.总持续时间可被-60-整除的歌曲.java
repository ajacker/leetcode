/*
 * @lc app=leetcode.cn id=1010 lang=java
 *
 * [1010] 总持续时间可被 60 整除的歌曲
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] index = new int[60];
        for (int n : time) {
           //加上能和它配对的个数，比如20为余数的 和40为余数的配对
            count += index[(60 - n % 60) % 60];
            index[n % 60]++;
        }
        return count;
    
    }
}
// @lc code=end

