import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
                sum += num;
            } else if (map.get(num) == 1) {
                map.put(num, 2);
                sum -= num;
            }
        }
        
        return sum;
    }
}
