/*
 * @lc app=leetcode.cn id=1189 lang=java
 *
 * [1189] “气球” 的最大数量
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for(char ch :text.toCharArray()){
            letters[ch - 'a'] ++;
        }
        letters['l' - 'a'] /= 2;
        letters['o' - 'a'] /= 2;
        int min = Integer.MAX_VALUE;
        for(char ch : "balon".toCharArray()){
            if(letters[ch - 'a'] < min){
                min = letters[ch - 'a'];
            }
        }
        return min;
    }
}
// @lc code=end

