/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        boolean plus = true;
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (!plus)
                return digits;
            else if (i == 0 && digits[i] == 9) {
                int[] result = new int[len + 1];
                digits[i] = 0;
                System.arraycopy(digits, 0, result, 1, len);
                result[0] = 1;
                return result;
            } else {
                plus = digits[i] == 9;
                digits[i] = (digits[i] + 1) % 10;
            }
        }
        return digits;
    }
}
