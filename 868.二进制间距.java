/*
 * @lc app=leetcode.cn id=868 lang=java
 *
 * [868] 二进制间距
 */

// @lc code=start
class Solution {
    public int binaryGap(int N) {
        int max = 0;
        int dis = 0;
        boolean start = false;
        while (N != 0) {
            int cur = N & 1;
            if (cur == 1) {
                max = Math.max(max, dis);
                dis = 0;
                start = true;
            }
            N >>= 1;
            if(start){
                dis++;
            }
        }
        return max;
    }
}
// @lc code=end
