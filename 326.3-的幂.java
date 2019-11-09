/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        //1162261467=3^19，因为3是质数，所以能被它整除的就是3的幂
        return n > 0 && 1162261467 % n == 0;
    }
}
