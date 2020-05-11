import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1175 lang=java
 *
 * [1175] 质数排列
 */

// @lc code=start
class Solution {
    public int numPrimeArrangements(int n) {
        // 找出n以内的全部质数
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // 统计质数的个数
        int countPrime = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                countPrime++;
            }
        }
        // 计算质数的全排列乘以非质数的全排列 prime! * (n - prime)!
        long count = 1;
        int min = Math.min(countPrime, n - countPrime);
        for (int i = 1; i <= min; i++) {
            count = (count * i * i) % 1000000007;
        }
        for (int i = min + 1; i <= Math.max(countPrime, n - countPrime); i++) {
            count = (count * i) % 1000000007;
        }
        return (int) (count);

    }
}
// @lc code=end
