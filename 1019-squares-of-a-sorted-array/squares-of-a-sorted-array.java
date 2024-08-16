import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            int t = Math.abs(nums[i])*Math.abs(nums[i]);
            arr[i] = t;
        }
        Arrays.sort(arr);
        return arr;
    }
}