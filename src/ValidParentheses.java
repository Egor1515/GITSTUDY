import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

//        System.out.println(parcMethod(new int[]{1000, 2000, 3000, 4000}));
    }

    public static boolean parcMethod(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ('(') || c == ('[') || c == ('{')) {
                stack.push(c);
            } else if (stack.empty()) return false;
            else if (c == ')' && stack.pop() != '(') return false;
            else if (c == '}' && stack.pop() != '{') return false;
            else if (c == ']' && stack.pop() != '[') return false;
        }
        return stack.empty();
    }
}
