/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */
class Solution {
    public boolean isUgly(int num) {
        if(num<=0) return false;
        if(num==1) return true;
        while(num%3==0) num/=3;
        while(num%5==0) num/=5;
        //判断是不是2的次方
        return (num&(num-1))==0;
    }
}

