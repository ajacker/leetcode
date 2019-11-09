/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */
class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            while (start < end && (!isVowel(array[start]) || !isVowel(array[end]))) {
                if (!isVowel(array[start]))
                    start++;
                if (!isVowel(array[end]))
                    end--;
            }
            if (start < end) {
                char temp = array[start];
                array[start++] = array[end];
                array[end--] = temp;
            }
        }
        return new String(array);
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
