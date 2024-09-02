class Solution {
    public int chalkReplacer(int[] arr, int k) {
        int i = 0;
        while(k>=arr[i]){
            k = k - arr[i];
            if(i!=arr.length-1) i++;
            else i = 0;
        }
        return i;
    }
}