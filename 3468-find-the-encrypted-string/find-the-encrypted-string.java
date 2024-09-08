class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            st.setCharAt(i,s.charAt((i+k)%s.length()));
        }
        return st.toString();
    }
}