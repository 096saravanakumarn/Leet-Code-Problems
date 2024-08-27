import java.util.*;

class Solution {
    public int thirdMax(int[] arr) {
        int c = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                c++;
            }
            if (c == 2) {
                return arr[i - 1];
            }
        }
        return arr[arr.length - 1];
    }
}