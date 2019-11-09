import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */
class Solution {
    public boolean isPalindrome(String s) {
        char[] array =  s.toCharArray();
        int len = array.length;
        int p = 0;
        int q = len - 1;
        while(p < q){
            char a = array[p];
            char b = array[q];
            if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)){
                if(Character.toLowerCase(a) == Character.toLowerCase(b)){
                    p++;
                    q--;
                }else return false;
            }else{
                if(Character.isLetterOrDigit(a)) q--;
                else p++;
            }
        }
        return true;
    }
}

