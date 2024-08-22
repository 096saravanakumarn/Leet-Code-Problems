class Solution {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for(int i=0;i<words.length;i++){
            String s1 = "";
            int l = words[i].length();
            if(words[i].length() <= s.length())
                s1 = s.substring(0,l);
            if(words[i].equals(s1)){
                c++;
            }
        }
        return c;
    }
}