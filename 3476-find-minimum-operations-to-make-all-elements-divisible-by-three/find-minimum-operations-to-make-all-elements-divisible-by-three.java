class Solution {
    public int minimumOperations(int[] arr) {
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]+1) % 3 == 0){
                c++;
            }
            else if((arr[i]-1) % 3 == 0){
                c++;
            }
        }
        return c; 
    }
}