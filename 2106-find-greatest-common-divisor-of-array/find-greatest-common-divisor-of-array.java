import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];
        for(int i=1;i<=s;i++){
            if(s%i == 0 && l%i == 0){
                max = Math.max(max,i);
            }
        }
        return max;
    }
}