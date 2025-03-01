public class Main {
    public static void main(String[] args) {

        //Question 4: (code) Balanced Brackets [25 points]
        System.out.println("Question 4: Balanced Brackets");
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
        System.out.println(BalancedBrackets.isBalanced("{{[[(())]]}}"));

        //Question 5: (code) Decode String [25 points]
        System.out.println("\nQuestion 5: Decode String");
        DecodeString decodeString = new DecodeString();
        System.out.println(DecodeString.decodeString("3[a]2[bc]"));
        System.out.println(DecodeString.decodeString("3[a2[c]]"));
        System.out.println(DecodeString.decodeString("2[abc]3[cd]ef"));

        //Question 6: (code) Infix to postfix [10 points]
        System.out.println("\nQuestion 6: Infix to postfix");
        System.out.println(InfixtoPostfix.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));


    }
}
