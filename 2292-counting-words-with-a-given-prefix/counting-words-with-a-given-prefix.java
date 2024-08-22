import java.util.*;
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for(int i=0;i<words.length;i++){
            String s = "";
            if(words[i].length() >= pref.length())
                 s = words[i].substring(0,pref.length());
            if(s.equals(pref)){
                c++;
            }
        }
        return c;
    }
}