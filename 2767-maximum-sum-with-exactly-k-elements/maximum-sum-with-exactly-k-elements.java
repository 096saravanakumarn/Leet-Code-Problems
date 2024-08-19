import java.util.*;
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0,sum=0;
        for(int i=0;i<k;i++){
            a = nums[nums.length-1]++;
            sum+=a;
        }
        return sum;
    }
}