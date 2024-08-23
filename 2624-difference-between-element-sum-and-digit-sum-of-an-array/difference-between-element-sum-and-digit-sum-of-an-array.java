class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            while (nums[i] > 0) {
                int a = nums[i] % 10;
                sum2 += a;
                nums[i] /= 10;
            }
        }
        return sum1 - sum2;
    }
}