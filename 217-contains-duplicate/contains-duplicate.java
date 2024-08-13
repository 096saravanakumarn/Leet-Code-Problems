import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      //  Arrays.sort(nums);
        HashSet<Integer> l = new HashSet<>();
        for(int n : nums){
            if(l.contains(n)){
                return true;
            }
            else{
                l.add(n);
            }  
        }
        return false;
    }
}