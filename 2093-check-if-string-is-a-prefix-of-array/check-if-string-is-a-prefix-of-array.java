class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String s1 = "";
        for(int i=0;i<words.length;i++){
            s1+=words[i];
            if(s.equals(s1)){
                return true;
            }
        }
       return false;
    }
}