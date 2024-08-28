import java.util.*;
class Solution {
    public int maximumWealth(int[][] arr) {
        int sum = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}