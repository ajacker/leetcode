import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1002 lang=java
 *
 * [1002] 查找常用字符
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] A) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);
        for (String str : A) {
            int[] count = new int[26];
            char[] array = str.toCharArray();
            for (char c : array) {
                count[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(count[i], common[i]);
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                res.add((char)('a'+i)+"");
            }
        }
        return res;
    }
}
// @lc code=end
