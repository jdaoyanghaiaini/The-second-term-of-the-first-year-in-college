import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String s;
        s.length();
        String tokens[] = new String[3];
        String s = "(){}[]";
        Stack<Integer> stack = new Stack<>();
        stack.push()
        s.eq;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            else {
                if(stack.peek() == '{' && ch == '}') {
                    stack.pop();
                }
                else if(stack.peek() == '[' && ch == ']'){
                    stack.pop();
                } else if(stack.peek() == '(' && ch == ')'){
                    stack.pop();
                }
                else {
                    System.out.println(false);
                    System.exit(0);
                }
            }
        }
        stack.empty()
        System.out.println(true);
    }

}
