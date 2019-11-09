import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */
class Solution {
    public int longestPalindrome(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]) && map.get(array[i]) == 1) {
                map.put(array[i], 0);
                maxlen += 2;
            } else {
                map.put(array[i], 1);
            }
        }
        return map.containsValue(1) ? maxlen + 1 : maxlen;
    }
}
