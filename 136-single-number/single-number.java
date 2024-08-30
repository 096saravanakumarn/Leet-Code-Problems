import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();
            if(value == 1){
                return key;
            }
       }
       return -1; 
    }
}