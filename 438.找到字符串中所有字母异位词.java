import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();
        if (pArray.length == 0)
            return result;
        for (int i = 0; i < pArray.length; i++) {
            map[pArray[i] - 'a']++;
        }
        int[] tMap = Arrays.copyOf(map, 26);
        int left = -1,right=-1;
        while(right<sArray.length){
            if(left++!=-1){
                char c = sArray[left-1];
                tMap[c-'a']++;
            }
            while(right-left<pArray.length-1){
                right++;
                if(right>=sArray.length) break;
                char c = sArray[right];
                tMap[c-'a']--;
            }
            boolean flag=true;
            for (int var : tMap) {
                if(var!=0) flag=false;
            }
            if(flag) result.add(left);
        }
        return result;
    }
}
