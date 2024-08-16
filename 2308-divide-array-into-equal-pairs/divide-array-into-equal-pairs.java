class Solution {
    public boolean divideArray(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j] && arr[i]!=0){
                    c++;
                    arr[j] = 0;
                    break;
                }
            }
        }
        if(arr.length/2 == c){
            return true;
        }
        return false;
    }
}