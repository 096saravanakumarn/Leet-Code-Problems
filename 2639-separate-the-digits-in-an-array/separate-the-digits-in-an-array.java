import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            String s = "";
            while (nums[i] > 0) {
                s += Integer.toString(nums[i] % 10);
                nums[i] /= 10;
            }
            for (int j = s.length() - 1; j >= 0; j--)
                list.add(Integer.parseInt(s.charAt(j) + ""));
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }
}