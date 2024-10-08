class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = t.indexOf(s.charAt(i), lastIndex);
            if (index == -1)
                return false;
            else {
                lastIndex = index + 1;
            }
        }
        return true;
    }
}