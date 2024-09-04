class Solution {
    public int maxPower(String s) {
        int c = 0;
        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
            }
            else{
                max = Math.max(max,c);
                c = 0;
            }
        }
        max = Math.max(max,c);
        return max+1;
    }
}