class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int arr[] = new int[s.length()]; 
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(s.charAt(i)+"");
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                sum+=arr[i];
            }
            else{
                sum+=arr[i]*-1;
            }
        }
        return sum;
    }
}