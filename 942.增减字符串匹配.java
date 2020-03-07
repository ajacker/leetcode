/*
 * @lc app=leetcode.cn id=942 lang=java
 *
 * [942] 增减字符串匹配
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String S) {
        int sLen = S.length();
        int[] arr = new int[sLen + 1];
        int max = sLen;
        int min = 0;
        for(int i = 0 ; i < sLen; i++) {
            if('D' == S.charAt(i)) {
                arr[i] = max--;
            } else {
                arr[i] = min++;
            }
        }
        arr[sLen] = max;
        return arr;
    }
}
// @lc code=end

