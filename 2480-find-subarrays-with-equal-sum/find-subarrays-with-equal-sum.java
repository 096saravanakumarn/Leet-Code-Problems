import java.util.*;
class Solution {
    public boolean findSubarrays(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            sum = nums[i]+nums[i+1];
            if(list.contains(sum)){
                return true;
            }
            list.add(sum);
        }
        System.out.print(list);
        return false;
    }
}