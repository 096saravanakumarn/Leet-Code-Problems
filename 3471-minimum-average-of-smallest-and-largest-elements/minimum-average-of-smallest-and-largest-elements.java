import java.util.*;
class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        //List<Double> list = new ArrayList<>();
        double min = Double.MAX_VALUE;
        while(i<j){
            double avg = (arr[i]+arr[j])/2d;
            if(min > avg){
                min = avg;
            }
            //list.add(avg);
            i++;
            j--;
        }
       // Collections.sort(list);
       // return list.get(0);
       return min;
    }
}