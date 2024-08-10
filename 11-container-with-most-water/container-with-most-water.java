import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int tmin = Math.min(height[l],height[r]);
            max = Math.max(max, tmin*(r - l));
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