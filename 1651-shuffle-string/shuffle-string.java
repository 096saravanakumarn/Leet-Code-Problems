import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[] = s.toCharArray();
        Map<Integer,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],ch[i]);
        }
        String st = "";
        for(Map.Entry<Integer,Character> e : map.entrySet()){
            st+=e.getValue();
        }
        return st;
    }
}