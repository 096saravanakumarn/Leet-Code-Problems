import java.util.*;
class Solution {
    public static String compare(String s){
         Stack<Character> st = new Stack<>();
          for(char ch:s.toCharArray()){
            if(ch != '#'){
                st.push(ch);
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public boolean backspaceCompare(String s, String t) {
        String s1 = compare(s);
        String s2 = compare(t);
        return s1.equals(s2);
    }
}