class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            c = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.contains(words[i].charAt(j) + "")) {
                    c++;
                }
                if (words[i].length() == c) {
                    count++;
                }
            }
        }
        return count;
    }
}