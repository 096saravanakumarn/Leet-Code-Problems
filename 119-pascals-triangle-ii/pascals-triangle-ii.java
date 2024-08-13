class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex ; i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else{
                    List<Integer> prev = pascal.get(i-1);
                    list.add(prev.get(j)+prev.get(j-1));
                }
            }
            pascal.add(list);
        }
        return pascal.get(rowIndex);
    }
}