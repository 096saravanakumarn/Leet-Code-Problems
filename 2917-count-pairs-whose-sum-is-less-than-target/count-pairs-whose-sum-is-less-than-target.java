class Solution {
    public int countPairs(List<Integer> arr, int target) {
        int c = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if((arr.get(i)+arr.get(j)) < target ){
                    c++;
                }
            }
        }
        return c;
    }
}