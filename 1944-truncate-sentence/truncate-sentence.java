class Solution {
    public String truncateSentence(String s, int k) {
        String st[] = s.split(" ");
        String s1 = "";
        for (int i = 0; i < k; i++) {
            if (i != k - 1)
                s1 += st[i] + " ";
            else
                s1 += st[i];
        }
        return s1;
    }
}