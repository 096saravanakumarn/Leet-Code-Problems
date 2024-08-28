class Solution {
    public boolean isThree(int n) {
        int c = 1;
        int i = 1;
        while(n>i){
            if(n%i == 0){
                c++;
            }
            i++;
        }
        return c == 3;
    }
}