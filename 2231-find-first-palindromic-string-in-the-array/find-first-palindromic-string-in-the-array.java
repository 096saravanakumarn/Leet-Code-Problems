class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder st = new StringBuilder(words[i]);
            if(words[i].equals(st.reverse()+"")){
                return words[i];
            }
        }
        return "";
    }
}