class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new  StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        for(int i=stack.size()-1;i>=0;i--){
            st.append(stack.get(i));
        }
        return st.reverse().toString();
    }
}