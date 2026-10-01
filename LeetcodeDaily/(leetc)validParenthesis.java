import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        // If string length is odd, it can't be valid
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If stack is empty or top element doesn't match current closing bracket
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // Valid if all opening brackets were properly closed
        return stack.isEmpty();
    }
}
