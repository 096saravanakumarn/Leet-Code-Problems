import java.util.*;
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int arr[] = new int [releaseTimes.length];
        arr[0] = releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
           int t = releaseTimes[i]-releaseTimes[i-1];
           arr[i] = t;
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int  k = 0;
        int in = 0;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max = arr[i];
            }
        } 
        List<Character> list = new ArrayList<>(); 
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max)
                list.add(keysPressed.charAt(i));
        }
        Collections.sort(list);
        System.out.print(list);
        return list.get(list.size()-1);
    }
}