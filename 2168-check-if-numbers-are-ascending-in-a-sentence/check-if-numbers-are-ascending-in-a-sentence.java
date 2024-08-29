import java.util.*;
class Solution {
    public boolean areNumbersAscending(String s) {
        String st[] = s.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<st.length;i++){
            if(Character.isDigit(st[i].charAt(0))){
                int t = Integer.parseInt(st[i]);
                list.add(t);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}