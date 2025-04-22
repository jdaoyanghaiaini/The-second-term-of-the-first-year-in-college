public class S {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<tokens.length;i++) {
                if(isOperator(tokens[i])){
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    switch(tokens[i]) {
                        case "+" :
                            stack.push(val2+val1);
                            break;
                        case "-" :
                            stack.push(val2-val1);
                            break;
                        case "*" :
                            stack.push(val2*val1);
                            break;
                        case "/" :
                            stack.push(val2/val1);
                            break;
                    }
                }
                else {
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
            return stack.pop();
        }
        public boolean isOperator(String s) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                return true;
            }
            return false;
        }
    }




    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                if(ch == '{' || ch == '[' || ch == '(') {
                    stack.push(ch);
                }
                else {
                    if(stack.empty()) {
                        return false;
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
                        else return false;
                    }
                }
            }
            if(stack.empty()) return true;
            return false;
        }
    }
}
