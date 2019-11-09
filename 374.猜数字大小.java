/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            switch (guess(mid)) {
            case -1:
                end = mid - 1;
                break;
            case 1:
                start = mid + 1;
                break;
            default:
                return mid;
            }
        }
        return -1;
    }
}
