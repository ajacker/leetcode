/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        int balance = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L') balance --;
            if(s.charAt(i) == 'R') balance ++;
            if(balance == 0) cnt ++;
        }
        return cnt;
    }

}
// @lc code=end
