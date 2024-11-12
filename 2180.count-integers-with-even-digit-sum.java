
import jdk.jshell.EvalException;

/*
 * @lc app=leetcode id=2180 lang=java
 *
 * [2180] Count Integers With Even Digit Sum
 */

// @lc code=start
class Solution {
    public int countEven(int num) {
        int evenSumCount = 0;
        for (int currentNumber = 1; currentNumber <=num; ++currentNumber) {
            int digitSum = 0;
            for (int x = currentNumber; x >0; x/=10) {
                digitSum +=x%10; //Adding the rightmost number   
            }
            if(digitSum%2==0) ++evenSumCount;   
        }   
        return evenSumCount;
    }
}
// @lc code=end

