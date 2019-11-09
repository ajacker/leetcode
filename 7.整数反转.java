/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x) {
        try {
            return x > 0 ? Integer.valueOf(new StringBuffer(String.valueOf(x)).reverse().toString())
                    : Integer.valueOf("-" + new StringBuffer(String.valueOf(x)).reverse().toString().replace("-", ""));
        } catch (Exception e) {
            return 0;
        }

    }
}
