/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */
class Solution {
    public char findTheDifference(String s, String t) {
        int[] content = new int[26];
        for (char c : s.toCharArray()) content[c-'a']++;
        for (char c : t.toCharArray()) {
            content[c-'a']--;
            if(content[c-'a']==-1) return c;
        }
        return ' ';
    }
}

