import java.util.*;
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            sum2+=nums2[i];
        }
        return (sum2/nums1.length) - (sum1/nums1.length);
    }
}