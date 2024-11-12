/*
 * @lc app=leetcode id=2165 lang=java
 *
 * [2165] Smallest Value of the Rearranged Number
 */

// @lc code=start
class Solution {
    public long smallestNumber(long num) {

      if(num == 0) return 0;

      int[] digitCount = new int[10];

      boolean isNegative = num<0;

      num = Math.abs(num);

      while(num!=0){
        digitCount[(int) (num % 10)]++;
        num /=10;
      }  

      long result = 0; //to hold the smallest number
      
      if(isNegative){
        for(int i=9;i>=0;--i){
            while(digitCount[i]-- >0){
                result = result * 10 + i;
            }
        }
        return -result; //returns negated number since original number was negative

      }

      if(digitCount[0]>0){
        for(int i=1;i<10;++i){
            if(digitCount[i]>0){
                result = result * 10 + i;
                digitCount[i]--;
                break;
            }
        }
      }

      for(int i=0; i<10;++i){
        while(digitCount[i]-- >0){
            result = result * 10 + i; 
        }
      }

      return result;

    }
}
// @lc code=end

