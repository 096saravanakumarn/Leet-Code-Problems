import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
       int rs = 0, re = arr.length;
		int cs = 0, ce = arr[0].length;

		List<Integer> list = new ArrayList<>();
		while(rs<re && cs<ce) {
			for(int i=cs;i<ce;i++) {
				list.add(arr[rs][i]);
			}
			rs+=1;
			if(list.size()==(arr.length)*(arr[0].length)) {
				break;
			}
			for(int i=rs;i<re;i++) {
				list.add(arr[i][ce-1]);
			}
			ce-=1;
			if(list.size()==(arr.length)*(arr[0].length)) {
				break;
			}
			for(int i=ce-1;i>=cs;i--) {
				list.add(arr[re-1][i]);
			}
			re-=1;
			if(list.size()==(arr.length)*(arr[0].length)) {
				break;
			}
			for(int i=re-1;i>=rs;i--) {
				list.add(arr[i][cs]);
			}
			cs+=1;
			if(list.size()==(arr.length)*(arr[0].length)) {
				break;
			}
		}
        return list;
    }
}