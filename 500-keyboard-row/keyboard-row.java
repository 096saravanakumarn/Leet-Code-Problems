class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int c = 0;
            int count = 0;
            if (s1.contains(words[i].charAt(0) + ""))
                c = 1;
            if (s2.contains(words[i].charAt(0) + ""))
                c = 2;
            if (s3.contains(words[i].charAt(0) + ""))
                c = 3;
            if (c == 1) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (s1.contains(words[i].charAt(j) + ""))
                        count++;
                }
            } else if (c == 2) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (s2.contains(words[i].charAt(j) + ""))
                        count++;
                }
            } else if (c == 3) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (s3.contains(words[i].charAt(j) + ""))
                        count++;
                }
            }
            if (count == words[i].length())
                list.add(words[i]);
        }
        String result[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}