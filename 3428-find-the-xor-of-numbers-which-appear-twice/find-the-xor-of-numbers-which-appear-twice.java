class Solution {
    public int duplicateNumbersXOR(int[] arr) {
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    ans = ans ^ arr[i];
                }
            }
        }
        return ans;
    }
}