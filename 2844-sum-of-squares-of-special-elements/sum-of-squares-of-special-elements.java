class Solution {
    public int sumOfSquares(int[] nums) {
        int j = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            j = i+1;
            if(nums.length%j == 0){
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
}