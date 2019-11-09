/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */
class Solution {
    public int mySqrt(int x) {
        if (x == 1)
            return 1;
        return mSqrt(0, x / 2 + 1, x);
    }

    public int mSqrt(int start, int end, int aim) {
        int n = (start + end) / 2;
        if (start == n)
            return start;
        if (n == aim / n)
            return n;
        else if (n > aim / n) {
            return mSqrt(start, n, aim);
        } else {
            return mSqrt(n, end, aim);
        }
    }
}
