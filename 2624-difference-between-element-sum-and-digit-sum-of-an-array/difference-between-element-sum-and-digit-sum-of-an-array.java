class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0,sum2 = 0;
        String s = "";
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            s+=Integer.toString(nums[i]);
        }
        String st[] = s.split("");
        for(int i=0;i<st.length;i++){
            int t = Integer.parseInt(st[i]);
            sum2+=t;
        }
        return sum1-sum2;
    }
}