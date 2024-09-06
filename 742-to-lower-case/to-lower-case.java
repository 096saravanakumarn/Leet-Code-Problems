class Solution {
    public String toLowerCase(String s) {
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                st.append(Character.toLowerCase(c));
            else
                st.append(c);
        }
        return st.toString();
    }
}