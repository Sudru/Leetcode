import java.util.*;
import java.util.stream.Collectors;
public class MakeStringGreat1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("s"));
    }   
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(Math.abs(stack.peek()-s.charAt(i))==32){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        return stack.stream().map(a->a.toString()).collect(Collectors.joining(""));
    }
}
