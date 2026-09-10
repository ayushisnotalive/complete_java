import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int summ = 0;
        for(int i=0; i<k; i++){
            summ += nums[i];

        }

        int maxSum = summ;
        for(int i =k; i<=nums.length; i++){
            summ = summ - nums[i-k] + nums[i];
            if(summ>maxSum){
                maxSum = summ;
            }
        }
        return (double) maxSum/k;
    }
}