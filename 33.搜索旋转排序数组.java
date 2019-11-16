/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    int[] nums;
    int target;

    /**
     * 二分查找找到在哪里旋转的
     * 
     * @param left
     * @param right
     * @return
     */
    public int find_roate_index(int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            // 检查索引是否越界
            if (mid >= 0 && mid + 1 < nums.length && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (nums[mid] < nums[left]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public int find_target(int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            // 检查索引是否越界
            if (mid >= 0 && mid < nums.length && nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        this.nums = nums;
        this.target = target;
        int roate = find_roate_index(0, n - 1);
        if (roate == 0) {
            return find_target(0, n - 1);
        }
        if (target < nums[0]) {
            return find_target(roate, n - 1);
        }
        return find_target(0, roate - 1);
    }
}
// @lc code=end
