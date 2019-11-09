import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(pattern.length() != strings.length){
            return false;
        }
        HashMap<Object,Integer> hashMap = new HashMap<>();
        //如果匹配，put的返回值应相同
        for(int i = 0;i < pattern.length();i++){
            if(!Objects.equals(hashMap.put(pattern.charAt(i),i),hashMap.put(strings[i],i))){
                return false;
            }
        }
        return true;
    }
}
