/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */
class Solution {
    public int getSum(int a, int b) {
        //a ^ b得到无进位的加结果
        //a & b得到进位结果，左移一位模拟竖式，如果这位有进位信号就加到高一位上
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
