import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */
class Solution {
    public int countSegments(String s) {
        boolean alpha = false;
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=' '){
                if(!alpha) count++;
                alpha=true;
            }else alpha=false;
        }
        return count;
    }
}

