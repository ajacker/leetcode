
/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target > nums[i]) pos++;
        }
        return pos;
    }
}

