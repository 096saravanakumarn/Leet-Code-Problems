class Solution {
    public boolean isArraySpecial(int[] arr) {
        if(arr.length == 1){
            return true;
        }
        int c = 0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i] % 2 == 0 && arr[i+1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i+1] % 2 == 0)){
                c++;
            }
        }
        if(c == arr.length-1)
            return true;
        return false;
    }
}