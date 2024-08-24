class Solution {
    public int countEven(int num) {
        int sum = 0;
        int c = 0;
        for(int i=1;i<=num;i++){
            int n = i;
            sum = 0;
            while(n>0){
                int a = n%10;
                sum+=a;
                n=n/10;
            }
            
            if(sum%2==0){
                c++;
            }
        }
        return c;
    }
}