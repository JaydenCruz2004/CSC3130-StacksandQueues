import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<String> stackStr = new Stack<>();
        Stack<Integer> stackNum = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                currNum = currNum * 10 + (c - '0');
            } else if (c == '[') {
                stackStr.push(currStr.toString());
                stackNum.push(currNum);
                currStr = new StringBuilder();
                currNum = 0;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(stackStr.pop());
                int num = stackNum.pop();
                for (int i = 0; i < num; i++) {
                    temp.append(currStr.toString());
                }
                currStr = temp;
            } else {
                currStr.append(c);
            }
        }

        return currStr.toString();
    }
}