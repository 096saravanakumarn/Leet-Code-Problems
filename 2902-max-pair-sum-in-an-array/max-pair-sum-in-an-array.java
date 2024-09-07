class Solution {
    public int maxSum(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int max = 0;
            while (num > 0) {
                int t = num % 10;
                max = Math.max(t, max);
                num /= 10;
            }
            arr[i] = max;
        }
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum = nums[i] + nums[j];
                    max1 = Math.max(max1, sum);
                    sum = 0;
                }
            }
        }
        return max1 == 0 ? -1 : max1;
    }
}