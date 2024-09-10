class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        arr1[0] = 0;
        arr2[nums.length-1] = 0;
        int  k = 0;
        int s1 = 0;
        int s2 = 0;
        for(int i=1;i<arr1.length;i++){
            s1+=nums[k++];
            arr1[i] = s1;
        } 
        k = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            s2+=nums[k--];
            arr2[i] = s2; 
        }
        for(int i=0;i<nums.length;i++){
            int t = 0 ;
            if(arr1[i]>arr2[i])
                t = arr1[i] - arr2[i];
            else
                t = arr2[i] - arr1[i];
          nums[i] = t;
        }

        return nums;
    }
}