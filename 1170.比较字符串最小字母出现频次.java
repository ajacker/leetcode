/* * @lc app=leetcode.cn id=1170 lang=java
 *
 * [1170] 比较字符串最小字母出现频次
 */

// @lc code=start
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int countj = f(queries[j]);
            for (int i = 0; i < words.length; i++) {
                int numi = f(words[i]);
                if (countj < numi){
                    res[j]++;
                }
            }
        }
        return res;
    }

    public static int f(String s) {
        int minsum = 0;
        char[] c = s.toCharArray();
        char min = c[0];
        for (int i = 0; i < c.length;) {
            if (c[i] >= min)
                i++;
            else {
                min = c[i];
                i++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == min)
                minsum++;
        }
        return minsum;
    }
}
// @lc code=end
