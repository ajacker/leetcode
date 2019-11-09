/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if(!s.contains(" ")) return s.length();
        else if(s.endsWith(" ")) s=s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }
}

