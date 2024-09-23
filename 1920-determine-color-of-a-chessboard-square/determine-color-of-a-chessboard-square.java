class Solution {
    public boolean squareIsWhite(String coordinates) {
        int arr[][] = { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 } };
        String s1 = coordinates.substring(0, coordinates.length() - 1);
        String s4 = coordinates.substring(1, coordinates.length());
        if (arr[Integer.parseInt(s4) - 1][s1.charAt(0) - 'a'] == 0) {
            return false;
        }
        return true;
    }
}