class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int c = 1;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int t = widths[s.charAt(i) - 'a'];
            sum+=t;
            if(sum>100){
                c++;
                sum = t;
            }
        }
        return new int[]{c,sum};
    }
}