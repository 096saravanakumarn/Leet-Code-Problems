class Solution {
    public boolean isValid(String s) {
        // Create a stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Handle closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or the top element doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if the closing bracket matches the opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets have been matched
        return stack.isEmpty();
    }
}