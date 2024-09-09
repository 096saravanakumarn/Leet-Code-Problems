class Solution {
    public String reverseWords(String s) {
        String st[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length;i++){
            for(int j = st[i].length()-1;j>=0;j--){
                sb.append(st[i].charAt(j));
            }
            if(i!=st.length-1)
            sb.append(" ");
        }
       return sb.toString();
    }
}