import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                st.push(ch);
            } else  {
                st.pop();
            }
        }
        StringBuilder s2 = new StringBuilder();
        while(!st.isEmpty()){
            s2.append(st.pop());
        }
        return s2.reverse().toString();
    }
}