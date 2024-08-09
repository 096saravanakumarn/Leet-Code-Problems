class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
		 int d = 0;
	        for(int i=0;i<arr.length;i++){
	            int min = arr[i][0];
	            int max = 0;
	            for(int j=0;j<arr[0].length;j++){
	                if(min>arr[i][j]){
	                    min = arr[i][j];
	                     d = j;
	                }
	            }
	            for(int k = 0;k<arr.length;k++){
                    if(max<arr[k][d]){
                        max = arr[k][d];
                    }
                }
                if(max == min){
	                ar.add(max);
	            }
	        }
	        return ar;
    }
}