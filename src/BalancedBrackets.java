import java.util.LinkedList;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) return "NO";

                char last = stack.removeLast();

                if ((c == ')' && last != '(') || (c == '}' && last != '{') || (c == ']' && last != '[')) {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
