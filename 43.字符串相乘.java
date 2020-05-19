/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        char[] big, small;
        if (num1.length() > num2.length()) {
            big = new StringBuilder(num1).reverse().toString().toCharArray();
            small = new StringBuilder(num2).reverse().toString().toCharArray();
        } else {
            big = new StringBuilder(num2).reverse().toString().toCharArray();
            small = new StringBuilder(num1).reverse().toString().toCharArray();
        }
        if (small.length == 1 && small[0] == '0') {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < small.length; i++) {
            int s = small[i] - '0';
            int last = 0;
            for (int j = 0; j < big.length; j++) {
                int b = big[j] - '0';
                int cur = s * b + last;
                if (res.length() > i + j) {
                    // 这一位有数字
                    int now = res.charAt(i + j) - '0';
                    // 进位 + 当前数 + 这一位本来的数 % 10就是现在的值
                    res.setCharAt(i + j, (char) ((now + cur) % 10 + '0'));
                    // 得到新的进位，这一位相加的进位，加上乘积的进位
                    last = (now + cur) / 10;
                } else {
                    // 这一位没有数字，就添加
                    res.append(cur % 10);
                    // 得到进位
                    last = cur / 10;
                }
                // 处理最后一个进位
                if (j == big.length - 1 && last != 0) {
                    res.append(last);
                }
            }
        }
        return res.reverse().toString();
    }
}
// @lc code=end
