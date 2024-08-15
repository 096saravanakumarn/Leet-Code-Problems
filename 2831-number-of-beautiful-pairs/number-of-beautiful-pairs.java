class Solution {
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static int first(int a){
        while(a>=10){
            a = a/10;
        }
        return a;
    }
    public int countBeautifulPairs(int[] arr) {
        int c = 0;
        for(int i=0;i<arr.length;i++){
            int f = first(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                int l = arr[j]%10;
                if(gcd(f,l) == 1){
                    c++;
                }
            }
        }
        return c;
    }
}