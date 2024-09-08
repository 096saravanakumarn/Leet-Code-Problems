class Solution {
    public String getSmallestString(String s) {
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<s.length()-1;i++){
            int n1 = Integer.parseInt(s.charAt(i)+"");
            int n2 = Integer.parseInt(s.charAt(i+1)+"");
            if(n1%2 == n2%2 && n1>n2){
                st.setCharAt(i,s.charAt(i+1));
                st.setCharAt(i+1,s.charAt(i));
                break;
            }
        }
        return st.toString();
    }
}