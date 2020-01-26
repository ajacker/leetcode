/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] big = new boolean[26];
        boolean[] small = new boolean[26];
        char[] gems = J.toCharArray();
        for (int i = 0; i < gems.length; i++) {
            if (Character.isUpperCase(gems[i])) {
                big[gems[i] - 'A'] = true;
            } else {
                small[gems[i] - 'a'] = true;
            }
        }
        int count = 0;
        char[] test = S.toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (Character.isUpperCase(test[i])) {
                if (big[test[i] - 'A']) {
                    count++;
                }
            } else {
                if (small[test[i] - 'a']) {
                    count++;
                }
            }
        }
        return count;
    }
}
// @lc code=end
