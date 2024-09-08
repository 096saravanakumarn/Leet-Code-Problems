class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                stack.push(s.charAt(i));
                ch[i] = '*';
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '*' && !stack.isEmpty())
                ch[i] = stack.pop();
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}