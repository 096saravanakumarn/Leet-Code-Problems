class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int c = 0;
        int i = 0;
        int arr[] = new int[2];
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() == 2){
                arr[i++] = e.getKey();
                c++;
            }
        }
        if(c == 2)
            return arr;
        return new int[]{};
    }
}
