import java.util.*;
class Solution {
    public char findTheDifference(String s, String t) {
        String s1[] = s.split("");
        String s2[] = t.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        String c ="";
        for(int i=0;i<s2.length;i++){
            if(i == s2.length-1){
                 c = s2[i];
            return c.charAt(0);
           }
           if(!s2[i].equals(s1[i])){
                c = s2[i];
            return c.charAt(0);
           }
        }
        return '0';
    }
}