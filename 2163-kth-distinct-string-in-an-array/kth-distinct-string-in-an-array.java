class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.print(map);
        for (String ch : map.keySet()) {
            System.out.print(ch);
            if (map.get(ch) == 1) {
                list.add(ch);
            }
        }

        if (k <= list.size()) {
            return list.get(k - 1);
        } else {
            return "";
        }
    }
}