import java.util.*;

class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max++;
        }
        return sum;
    }
}