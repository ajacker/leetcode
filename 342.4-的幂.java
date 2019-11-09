/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        // 只有奇数位有且只有一个1，偶数位都是0
        // 0x55555555 = 1010101010101010101010101010101 (偶数位为0，奇数位为1）
        // 0x55555555和数字做与应还是它本身
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;

    }
}
