import java.util.*;
class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        List<Double> list = new ArrayList<>();
        while(i<j){
            double avg = (arr[i]+arr[j])/2d;
            list.add(avg);
            i++;
            j--;
        }
        Collections.sort(list);
        return list.get(0);
    }
}