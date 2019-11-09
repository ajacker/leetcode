import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                isNotPrime[i] = false;
                count++;
                for (int j = 1; i * j < n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}
