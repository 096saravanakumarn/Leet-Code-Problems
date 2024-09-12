class Solution {
    public int findSpecialInteger(int[] arr) {
        int l = (arr.length)/4;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) > l){
                return arr[i];
            }
        } 
        return -1;
    }
}