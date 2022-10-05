import java.util.Stack;

public class ValidParenthesis20 {
public static void main(String[] args) {
    System.out.println(isValid("()[]{}"));
}

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++ ){
            char c = s.charAt(i);
            if(c=='[' || c=='{' || c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                    return false;
                char t = stack.pop();
                switch (c){
                    case ']':
                        if(t!='[')
                            return false;
                        break;    
                    case '}':
                        if(t!='{')
                            return false;
                        break;    
                    case ')':
                        if(t!='(')
                            return false;
                        break;    
                }
            }
            System.out.println(stack);
        }
        return stack.isEmpty();
    }
}
