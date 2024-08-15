import java.util.*;
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int c = 0;
            int max = 0;
            while(nums[i] > 0){
                int a = nums[i]%10;
                max = Math.max(max,a);
                nums[i]/=10;
                c++;
            }
            String s = "";
             for(int j=0;j<c;j++){
                s+=max;
             }
             int h = Integer.parseInt(s);
             sum+=h;
        }
        return sum;
    }
}