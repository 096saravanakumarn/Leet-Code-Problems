import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0) + 1);
            System.out.println(map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}