import java.util.*;
class Solution {
    public char findTheDifference(String s, String t) {
        int c1 = 0;
        int c2 = 0;
        for(char c:s.toCharArray()){
            c1+=(int)c;
        }
        for(char c:t.toCharArray()){
            c2+=(int)c;
        }
        return (char)(c2-c1);
    }
}