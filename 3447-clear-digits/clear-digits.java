class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new  StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) && !stack.isEmpty())
                stack.pop();
            else
                stack.push(c);
        }
        while(!stack.isEmpty())
            st.append(stack.pop());
        return st.reverse().toString();
    }
}