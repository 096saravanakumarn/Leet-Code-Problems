import java.util.*;
class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
        int c = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i] - arr[j]) == diff){
                    for(int k=j+1;k<arr.length;k++){
                        if(Math.abs(arr[j] - arr[k]) == diff){
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
}