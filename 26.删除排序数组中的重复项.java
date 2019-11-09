import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int newlen = 0;
        for (int i = 0; i < nums.length; i++)
            if (newlen == 0 || nums[i] != nums[newlen - 1])
                nums[newlen++] = nums[i];
        return newlen;
    }
}
