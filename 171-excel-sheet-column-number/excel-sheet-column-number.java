class Solution {
    public int titleToNumber(String columnTitle) {
        int  k = 0;
		 for(int i=0;i<columnTitle.length();i++){
			k=k*26 +(columnTitle.charAt(i)-'A'+1);
		 }
        return k;
    }
}