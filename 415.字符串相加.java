/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        char[] arr1 = sb1.reverse().toString().toCharArray();
        char[] arr2 = sb2.reverse().toString().toCharArray();
        int maxLen = Integer.max(arr1.length, arr2.length);
        int lastAdd = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            int a = i < arr1.length ? arr1[i] - '0' : 0;
            int b = i < arr2.length ? arr2[i] - '0' : 0;
            int current = (a + b + lastAdd) % 10;
            result.append(current);
            lastAdd = (a + b + lastAdd) / 10;
        }
        if (lastAdd != 0)
            result.append(lastAdd);
        return result.reverse().toString();

    }
}
