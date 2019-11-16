/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    int[] nums;
    int target;
    int len;

    public int[] searchRange(int[] nums, int target) {
        this.len = nums.length;
        int[] result = new int[] { -1, -1 };
        //空数组肯定找不到
        if (len == 0) {
            return result;
        }
        this.nums = nums;
        this.target = target;
        //找到左边和右边
        result[0] = findLeft(0, len);
        result[1] = findRight(0, len);
        return result;
    }
    /**
     * 二分查找target的开始位置
     * @param left 左边起始下标
     * @param right 右边范围结束标（不包括）
     * @return 找到返回下标，否则返回-1
     */
    public int findLeft(int left, int right) {
        //如果right不包括的话就是小于，如果包括right就是小于等于
        while (left < right) {
            int mid = (left + right) / 2;
            //如果大于或者等于target都向左边找（因为找target开始的位置嘛）
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        //结束循环后，如果有target，那么right一定在开始位置（因为right实际上不算包括）
        return right < len && nums[right] == target ? right : -1;
    }
    /**
     * 二分查找target的结束位置
     * @param left 左边起始下标
     * @param right 右边范围结束标（不包括）
     * @return 找到返回下标，否则返回-1
     */
    public int findRight(int left, int right) {
        //如果right不包括的话就是小于，如果包括right就是小于等于
        while (left < right) {
            int mid = (left + right) / 2;
            //如果小于或者等于target都向右边找（因为找target结束的位置嘛）
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        //这个时候如果有target，那么left一定在结束前+1过（if的条件），所以就看left-1这个位置
        return left - 1 >= 0 && nums[left - 1] == target ? left - 1 : -1;
    }
}
// @lc code=end
