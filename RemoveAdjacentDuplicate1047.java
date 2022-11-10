import java.util.*;
import java.util.stream.Collectors;
public class RemoveAdjacentDuplicate1047{
	public static void main(String[] args){
		System.out.println(removeDuplicates("azxxzy"));
	}
	public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() || stack.peek()!=s.charAt(i)){
            	stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        
       return stack.stream().map(a->a.toString()).collect(Collectors.joining(""));
    }

}