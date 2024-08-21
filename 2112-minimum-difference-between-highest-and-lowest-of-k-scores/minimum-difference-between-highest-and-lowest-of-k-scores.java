import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= k - 1; i--) {
            int t = nums[i] - nums[i - k + 1];
            min = Math.min(min, t);
        }
        return min;
    }
}