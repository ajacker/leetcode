/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */
class Solution {
    public int addDigits(int num) {
        //太强了是个数学问题
        return (num - 1) % 9 + 1;
    }
}
