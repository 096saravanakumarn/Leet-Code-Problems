// class Solution {
//     public int findSpecialInteger(int[] arr) {
//         int l = (arr.length)/4;
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//             if(map.get(arr[i]) > l){
//                 return arr[i];
//             }
//         } 
//         return -1;
        
//     }
// }
class Solution {
    public int findSpecialInteger(int[] arr) {
        int a= (arr.length)/4+1;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                count++;
            }
            else{
                count = 1;
            }
            if(count >= a){
                return arr[i];
            }
        }
        return arr[0];
    }
}