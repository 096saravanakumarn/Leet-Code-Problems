class Solution {
    public void reverseString(char[] s) {
        char c[] = new char[s.length];
        int k = 0;
        for(int i=0;i<s.length;i++){
            c[i] = s[i];
        }
        for(int i=s.length-1;i>=0;i--){
            s[i] = c[k++];
        }
    }
}