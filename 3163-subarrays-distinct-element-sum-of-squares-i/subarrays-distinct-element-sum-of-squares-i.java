import java.util.*;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<nums.size();j++){
                System.out.print(nums.get(j)+" ");
                set.add(nums.get(j));
                result += set.size()*set.size();
            }
            System.out.println();
        }
        return result;
    }
}