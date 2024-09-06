class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        // String s1 = "";
        // String s2 = "";
        // for(int i=0;i<ch.length;i++){
        //     s1+=ch[i];
        //     s2+=ch1[i];
        // }
        return Arrays.equals(ch, ch1);
    }
}