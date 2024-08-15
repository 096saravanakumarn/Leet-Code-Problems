import java.util.*;
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                list.add(i);
            }
        }
        int s = 0;
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int t = queries[i];
            if(t<=list.size()){
                ans[i] = list.get(t-1);
            }
            else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}