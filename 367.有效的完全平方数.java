/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int start = 1;
        int end = num / 2 + 1 > 46340 ? 46341 : num / 2 + 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid * mid < num)
                start = mid + 1;
            else if (mid * mid > num)
                end = mid;
            else
                return true;
        }
        return false;
    }
}
