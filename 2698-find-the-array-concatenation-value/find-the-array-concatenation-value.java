class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long sum = 0;
        while (l < r) {
            String s = "";
            s += nums[l] + "" + nums[r];
            sum += Integer.parseInt(s);
            l++;
            r--;
        }
        if (nums.length % 2 != 0) {
            sum += nums[nums.length / 2];
        }
        return sum;
    }
}