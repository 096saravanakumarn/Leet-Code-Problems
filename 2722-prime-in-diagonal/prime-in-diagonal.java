class Solution {
    public static boolean checkPrime(int num){
        int c = 0;
        for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j == 0)
                    return false;
            }
            return true;
    }
    public int diagonalPrime(int[][] nums) {
        int k = nums.length-1;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(checkPrime(nums[i][i])){
                max = Math.max(max,nums[i][i]);
            }
            int t = nums[i][k--];
            if( checkPrime(t)){
                max = Math.max(max,t);
            }
        }     
        return max==1 ? 0:max;
    }
}