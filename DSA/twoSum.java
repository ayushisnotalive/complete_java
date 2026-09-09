import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x=0; x<nums.length;x++){
            int comp = target-nums[x];

            if(map.containsKey(comp)){
                return new int[] {map.get(comp),x};
            }
            map.put(nums[x],x);
        }
        return new int[] {};
    }
}


// passed all testcases and 
// Runtime:2 ms
// Beats:99.37%
