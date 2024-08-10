import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int tmin = Math.min(height[l],height[r]);
            int v = tmin*(r - l);
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