import java.util.*;
class Solution {
    public int findMaxK(int[] arr) {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            int max = arr[i];
            for(int j=0;j<arr.length;j++){
                if((max*-1) == arr[j])
                    return max;
            }
        }
        return -1;
    }
}