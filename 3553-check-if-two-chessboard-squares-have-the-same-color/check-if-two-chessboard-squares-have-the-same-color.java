class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int arr[][] = { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 } };
                // String s1 = 
                // String s2 = 
                // String s4 = 
                // String s5 = 
                if(arr[Integer.parseInt(coordinate1.substring(1,coordinate1.length()))-1][coordinate1.substring(0,coordinate1.length()-1).charAt(0)-'a'] == arr[Integer.parseInt(coordinate2.substring(1,coordinate2.length()))-1][coordinate2.substring(0,coordinate2.length()-1).charAt(0)-'a']){
                    return true;
                }
                return false;
    }
}