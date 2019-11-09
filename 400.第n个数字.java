/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第N个数字
 */
class Solution {
    public int findNthDigit(int n) {
        int maxi = 0;
        int i = 1;
        while (n > maxi + i * (Math.pow(10, i) - Math.pow(10, i - 1))) {
            maxi += i * (Math.pow(10, i) - Math.pow(10, i - 1));
            i++;
        }
        n -= maxi;
        n--;
        int remain = n % i;
        int counter = n / i;
        int inwhich = (int) Math.pow(10, i - 1) + counter;
        int rtn = 0;
        for (int j = 0; j < i - remain; j++) {
            rtn = inwhich % 10;
            inwhich /= 10;
        }
        return rtn;
    }
}
