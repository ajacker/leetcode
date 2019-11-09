/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int p = 0, q = 0;
        HashSet<Character> characters = new HashSet<>();
        int max = 0;
        while (q < chars.length) {
            //能加入集合代表不重复
            if(characters.add(chars[q])){
                q++;
                max = Integer.max(max, characters.size());
            }else {
                //重复的话移动左窗口
                characters.remove(chars[p++]);
            }
        }
        return max;
    }
}
// @lc code=end

