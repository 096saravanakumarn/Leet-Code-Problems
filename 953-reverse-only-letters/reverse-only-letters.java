class Solution {
    public String reverseOnlyLetters(String s) {
        String st = "";
        char ch[] = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(ch[i])){
                st+=ch[i];
            }     
        } 
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                ch[i] = st.charAt(k++);
            }  
        }
        return new String(ch);
    }
}