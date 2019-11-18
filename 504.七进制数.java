import java.math.BigInteger;

/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        boolean flag = num < 0;
        if (flag) {
            num *= -1;
        }else if(num== 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (flag) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
// @lc code=end
