class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int ind = 0;
            int min = nums[0];
            for (int j = 0; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    ind = j;
                }
            }
            nums[ind] = min * multiplier;
        }
        return nums;
    }
}