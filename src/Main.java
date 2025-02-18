public class Main {
    public static void main(String[] args) {
        //Question 4:(code) Balanced Brackets [25 points]
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
        System.out.println(BalancedBrackets.isBalanced("{{[[(())]]}}"));

    }
}
