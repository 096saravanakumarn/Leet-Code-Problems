// import java.util.*;
// class Solution {
//     public int missingNumber(int[] nums) {
//         List<Integer> l = new ArrayList<>();
//         for(int i:nums){
//             l.add(i);
//         }
//         for(int i=0;i<nums.length+1;i++){
//             if(!l.contains(i)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n : nums){
           set.add(n);
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
               return i;
            }
        }
        return -1;
    }
}