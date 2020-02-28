/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            while (left < chars.length && !Character.isLetter(chars[left])) {
                left++;
            }
            while (right >= 0 && !Character.isLetter(chars[right])) {
                right--;
            }
            if (left < right) {
                if (chars[left] != chars[right]) {
                    chars[left] ^= chars[right];
                    chars[right] ^= chars[left];
                    chars[left] ^= chars[right];
                }
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
// @lc code=end
