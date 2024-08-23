class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while(n>4){
            sum = 0;
            while(n>0){
                int a = n%10;
                sum+=a*a;
                n/=10;
            }
            n = sum;
             
        }
       
        return n==1;
    }
}