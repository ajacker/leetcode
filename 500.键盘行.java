import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> s1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        HashSet<Character> s2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        HashSet<Character> s3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char[] chars = str.toCharArray();
            boolean res = true;
            boolean f1 = false, f2 = false, f3 = false;
            for (int j = 0; j < chars.length; j++) {
                char c = Character.toLowerCase(chars[j]);
                if (s1.contains(c)) {
                    if (j == 0) {
                        f1 = true;
                    } else if (!f1) {
                        res = false;
                        break;
                    }
                } else if (s2.contains(c)) {
                    if (j == 0) {
                        f2 = true;
                    } else if (!f2) {
                        res = false;
                        break;
                    }
                } else if (s3.contains(c)) {
                    if (j == 0) {
                        f3 = true;
                    } else if (!f3) {
                        res = false;
                        break;
                    }
                }
            }
            if (res) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
}
// @lc code=end
