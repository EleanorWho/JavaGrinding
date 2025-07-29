import java.util.Stack;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        // Create a HashMap to store the parentheses
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        // Create a stack to check the parentheses
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)) {
                if (stack.empty() || stack.pop() != parentheses.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("([])"));
    }
}