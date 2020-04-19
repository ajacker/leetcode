/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                // 第一次出现不等的情况，删左边元素或者删右边元素再检查剩余元素是否为回文
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        //循环中没有出现左右两边不相等的情况，不需要删除就是回文，返回true
        return true;
    }
    /**
     * 判断是否为回文字符串
     */
    private boolean isPalindrome(String s, int lo, int hi){
        for(; lo < hi; lo++, hi--){
            if(s.charAt(lo) != s.charAt(hi))
                return false;
        }
        return true;
    }
}
// @lc code=end

