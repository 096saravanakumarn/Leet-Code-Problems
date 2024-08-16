import java.util.*;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String s[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> list = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String st = "";
            for(int j=0;j<words[i].length();j++){
                int t = words[i].charAt(j) - 'a';
                st+=s[t];
            }
            list.add(st);
        }
        return list.size();
    }
}