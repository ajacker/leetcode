import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
        12223357
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        // 第一个数的个数
        int baseCount = 0;
        // 第一个数的值（两个一对）
        int base = 0;
        //和谐数的个数
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            //如果是第一个进行初始化
            if (i == 0) {
                base = cur;
                baseCount = 1;
                count = 1;
                continue;
            }
            if (cur - base <= 1) {
                //满足和谐数 ，则计数
                if (base == cur) {
                    baseCount++;
                }
                count++;
            } else {
                if (cur - nums[i - 1] == 1) {
                    //如果不超出和谐数，则以上一个开始，记录连续和谐数
                    base = nums[i - 1];
                    baseCount = count - baseCount;
                    count = baseCount + 1;
                }else{
                    //如果超出1，则以当前开始
                    base = cur;
                    baseCount = 1;
                    count = 1;
                }
            }
            //只有当满足条件的才计算最大值
            if (cur != base && cur - base <= 1) {
                max = Integer.max(count, max);
            }
        }
        //max=1代表只有一个数，不可能是和谐的
        return max == 1 ? 0 : max;
    }
}
// @lc code=end
