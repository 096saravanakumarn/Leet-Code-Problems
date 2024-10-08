class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ar = ransomNote.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : ar) {
            list.add(c);
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (list.contains(magazine.charAt(i))) {
                int k = list.indexOf(magazine.charAt(i));
                list.remove(k);
            }
        }
        return list.isEmpty();
    }
}