import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        for (char c : t.toCharArray()) 
            if(map.containsKey(c)) map.put(c, map.get(c)-1);
            else map.put(c, 1);
        for (int i : map.values()) 
            if(i!=0) return false;
        return true;
    }
}

