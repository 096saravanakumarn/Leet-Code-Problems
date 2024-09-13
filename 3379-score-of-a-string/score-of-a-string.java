class Solution {
    public int scoreOfString(String s) {
        int arr[] = new int [s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = (int)s.charAt(i);
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            int t = 0;
            if(arr[i]>arr[i+1])
                t = arr[i]-arr[i+1];
            else
                t = arr[i+1]-arr[i];
                System.out.print(t+" ");
            sum+=t;
        }
        return sum;
    }
}