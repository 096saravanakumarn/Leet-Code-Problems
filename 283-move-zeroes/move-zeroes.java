import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
              l1.add(nums[i]);
            }    
            else{
               l2.add(0);
            } 
        }
            for(int i=0;i<l1.size();i++){
                nums[i] = l1.get(i);
            }
            int k = 0;
            for(int i=l1.size();i<nums.length;i++){
                nums[i] = l2.get(k++);
            }
        
    }
}