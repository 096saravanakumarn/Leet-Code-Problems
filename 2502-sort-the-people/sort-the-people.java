class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr = new String[heights.length];
        List<Integer> list = new ArrayList<>();
        for (int e : heights) {
            list.add(e);
        }
        Collections.sort(list);
        for (int i = 0; i < heights.length; i++) {
            int k = list.indexOf(heights[i]);
            arr[heights.length-k-1]=names[i];

        }
        return arr;
    }
}