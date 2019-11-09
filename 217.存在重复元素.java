import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for (int var : nums) {
            if(hSet.contains(var)) return true;
            else hSet.add(var);
        }
        return false;
    }
}

