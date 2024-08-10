import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int tmin = Math.min(height[l],height[r]);
            int m = r - l;
            int v = tmin*m;
            max = Math.max(max,v);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}