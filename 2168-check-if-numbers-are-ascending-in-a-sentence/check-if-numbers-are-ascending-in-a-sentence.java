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
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}