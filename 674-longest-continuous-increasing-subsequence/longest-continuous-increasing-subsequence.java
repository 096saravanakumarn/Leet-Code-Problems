class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            c = 0;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1])
                    c++;
                else
                    break;
            }
            max = Math.max(max, c);
        }
        return max + 1;
    }
}