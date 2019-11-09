/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {
    public int climbStairs(int n) {
        return myClimbStairs(1, 2, n);
    }
    public int myClimbStairs(int ret1,int ret2,int n){
        if(n==1){
            return ret1;
        }else{
            return myClimbStairs(ret2, ret1+ret2, n-1);
        }
        
    }
}

