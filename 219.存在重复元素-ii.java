/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
            //哈希表中最多有k个元素
            if(set.size() > k) set.remove(nums[i - k]);
        }
        return false;
    }
}

