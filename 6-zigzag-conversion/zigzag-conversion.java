import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        String st[][] = new String[numRows][s.length()];
        int row = 0;
        int col = 0;
        int curr = 0;
        while(curr < s.length()){
            while(row < numRows && curr < s.length()){
                st[row++][col] = s.charAt(curr++)+"";
            }
            row = Math.max(0,row - 2);
            while(row > 0 && curr < s.length()){
                st[row--][++col] = s.charAt(curr++)+""; 
            }
            col++;
        }
        String ans = "";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(st[i][j] != null) {
            		ans+=st[i][j];
            	}
            }
        }
        return ans;
    }
}