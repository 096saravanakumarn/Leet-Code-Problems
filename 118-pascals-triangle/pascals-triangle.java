import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascal = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prev = pascal.get(i-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}