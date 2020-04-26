/*
 * @lc app=leetcode.cn id=893 lang=java
 *
 * [893] 特殊等价字符串组
 */

// @lc code=start
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        // 当S 中偶数索引字母的数量，其后是 S 中奇数索引字母的数量时特殊等价
        Set<String> set = new HashSet();
        for (String S : A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i){
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            //分别统计奇数位和偶数位的字符出现次数，0-26放偶数位，27-52放奇数位
            set.add(Arrays.toString(count));
        }
        return set.size();
    }
}
// @lc code=end
