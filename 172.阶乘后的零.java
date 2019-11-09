/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */
class Solution {
    public int trailingZeroes(int n) {
        // 有几个5*2就有几个0
        int amount = 0;
        while (n >= 5) {
            amount += n / 5;
            n /= 5;
        }
        return amount;
    }

}
