class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int d = Character.getNumericValue(s.charAt(i));
            if(i%2 == 0)
                sum+=d;
            else
                sum+=d*-1;
        }
        return sum;
    }
}