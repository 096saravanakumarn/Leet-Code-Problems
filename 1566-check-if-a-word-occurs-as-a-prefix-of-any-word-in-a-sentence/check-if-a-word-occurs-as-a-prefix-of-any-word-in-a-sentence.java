class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String st[] = sentence.split(" ");
        for(int i=0;i<st.length;i++){
            String s = "";
            if(st[i].length()>=searchWord.length())
                s = st[i].substring(0,searchWord.length());
            if(s.equals(searchWord))
                return i+1;
        }
        return -1;
    }
}