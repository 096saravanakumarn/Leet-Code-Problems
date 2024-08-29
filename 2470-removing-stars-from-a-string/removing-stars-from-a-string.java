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
        String s2 = "";
        for (Character c : st) {
            s2 += c;
        }
        return s2;
    }
}