import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                //如果有因数i，一定有因数num/i，除非i*i=num（只能加一次）
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        //如果除了自己以外加起来等于自己，那么包括自己加起来等于二倍
        return sum - num == num;

    }
}
// @lc code=end
