class Solution {
    public int countSegments(String s) {
        int c = 0;
        String st[] = s.split(" ");
        for(int i=0;i<st.length;i++){
            if(!st[i].isEmpty()){
                c++;
            }
        }
        return c;
    }
}