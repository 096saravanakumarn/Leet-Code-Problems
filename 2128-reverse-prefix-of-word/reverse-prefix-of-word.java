import java.util.*;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder st = new StringBuilder();
        int ind = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ch) {
                st.append(word.charAt(i));
                if (i == word.length() - 1) {
                    return st.toString();
                }
            } else {
                st.append(word.charAt(i));
                st.reverse();
                ind = i + 1;
                break;
            }
        }
        st.append(word.substring(ind, word.length()));
        return st.toString();
    }
}