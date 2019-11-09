/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        //二进制表示下，n最高位为1，其余所有位为0
        //二进制表示下，n - 1最高位为0，其余所有位为1
        return n > 0 && (n & (n - 1)) == 0;
    }
}
