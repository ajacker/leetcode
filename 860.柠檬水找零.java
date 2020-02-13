/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
            case 5:
                fiveCount++;
                break;
            case 10:
                tenCount++;
                fiveCount--;
                break;
            default:
                if (tenCount > 0) {
                    tenCount--;
                } else {
                    fiveCount -= 2;
                }
                fiveCount--;
                break;
            }
            if (fiveCount < 0 || tenCount < 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
