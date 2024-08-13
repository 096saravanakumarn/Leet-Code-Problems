class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex + 1; i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else{
                    List<Integer> prev = lists.get(i-1);
                    list.add(prev.get(j)+prev.get(j-1));
                }
            }
            lists.add(list);
        }
        return lists.get(rowIndex);
    }
}