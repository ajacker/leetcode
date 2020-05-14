/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        char[] arr = str.toCharArray();
        int num = 0;
        boolean flag = true;
        int i = 0;
        // 跳过空白字符
        while (i < arr.length && arr[i] == ' ') {
            i++;
        }
        // 判断正负号
        if (i < arr.length && arr[i] == '-') {
            flag = false;
        }
        if (i < arr.length && (arr[i] == '+' || arr[i] == '-')) {
            i++;
        }
        // 记录数字
        // 用负数保存计算结果是因为负数情况下，绝对值大1
        int limit = flag ? -Integer.MAX_VALUE : Integer.MIN_VALUE;
        while (i < arr.length && Character.isDigit(arr[i])) {
            int cur = arr[i++] - '0';
            // 判断越界吗
            if (num < (limit + cur) / 10) {
                System.out.println(cur);
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            // 计算
            num = num * 10 - cur;
        }
        return flag ? -num : num;
    }
}
// @lc code=end
