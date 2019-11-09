import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            result += map.get(c);
            if (c == 'V' || c == 'X') {
                if (i - 1 >= 0 && chars[i - 1] == 'I') {
                    result -= 1 * 2;
                }
            }
            if (c == 'L' || c == 'C') {
                if (i - 1 >= 0 && chars[i - 1] == 'X') {
                    result -= 10 * 2;
                }
            }
            if (c == 'D' || c == 'M') {
                if (i - 1 >= 0 && chars[i - 1] == 'C') {
                    result -= 100 * 2;
                }
            }
        }
        return result;
    }
}
