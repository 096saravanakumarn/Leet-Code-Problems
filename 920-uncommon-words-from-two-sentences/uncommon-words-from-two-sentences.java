class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s:s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                list.add(e.getKey());
            }
        }
        
        String arr[] = new String[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}