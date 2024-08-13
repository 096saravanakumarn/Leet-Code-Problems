import java.util.*;
class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        double min = Double.MAX_VALUE;
        while(i<j){
            double avg = (arr[i]+arr[j])/2d;
            min = Math.min(min,avg);
            i++;
            j--;
        }
       return min;
    }
}