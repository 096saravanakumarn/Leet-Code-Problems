class Solution {
    public int balancedStringSplit(String s) {
        int rc = 0, lc = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (rc == lc) {
                count++;
                rc = 0;
                lc = 0;
            }
            if (s.charAt(i) == 'R')
                rc++;
            else
                lc++;

        }
        return count;
    }
}