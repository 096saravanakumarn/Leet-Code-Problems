class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr1[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
        int res[] = new int[arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        int c = 1;
        for(int i:arr1){
            if(!map.containsKey(i))
                map.put(i,c++);
        }
        for(int i=0;i<arr.length;i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}