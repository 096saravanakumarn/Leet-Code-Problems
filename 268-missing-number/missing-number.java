import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        for(int i=0;i<nums.length+1;i++){
            if(!l.contains(i)){
                return i;
            }
        }
        return -1;
    }
}