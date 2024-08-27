class Solution {
    static String isPalindrome(String s){
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);
        }
        return st;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(words[i].equals(isPalindrome(words[i]))){
                return words[i];
            }
        }
        return "";
    }
}