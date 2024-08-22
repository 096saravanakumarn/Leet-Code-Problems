class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1="";
        if(words.size() != s.length()) return false; 
        for(String i:words){
            s1+=i.charAt(0);
        }
        return s.equals(s1); 
    }
}