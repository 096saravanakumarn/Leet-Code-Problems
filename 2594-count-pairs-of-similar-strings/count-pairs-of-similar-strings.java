import java.util.*;
class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                char ch1[] = words[i].toCharArray();
                char ch2[] = words[j].toCharArray();
                Set<Character> set1 = new HashSet<Character>();
                Set<Character> set2 = new HashSet<Character>();
                for(char c:ch1){
                    set1.add(c);
                }
                for(char c:ch2){
                    set2.add(c);
                }
                if(set1.equals(set2)){
                    count++;
                }
            }
        }
        return count;
    }
}