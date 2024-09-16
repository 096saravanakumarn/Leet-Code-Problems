class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuffer sb = new StringBuffer(s);
        String st = "";
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                st+=sb.charAt(i);
            }     
        }
        System.out.print(sb +" "+st);
        char ch[] = s.toCharArray();
        int k=0;
        for(int i=0;i<ch.length;i++){
   
            if(Character.isLetter(ch[i])){
                ch[i] = st.charAt(k++);
            }  
   
        }
        return new String(ch);
    }
}