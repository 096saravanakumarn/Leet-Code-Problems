class Solution {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for(int i=0;i<words.length;i++){
            String s1 = "";
            if(words[i].length() <= s.length())
                s1 = s.substring(0,words[i].length());
            if(words[i].equals(s1)){
                c++;
            }
        }
        return c;
    }
}