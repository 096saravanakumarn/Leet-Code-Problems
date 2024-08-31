import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        String st = "";
        for(Map.Entry<Integer,Character> e : map.entrySet()){
            st+=e.getValue();
        }
        return st;
    }
}