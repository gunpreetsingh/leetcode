import java.util.Stack;

/**
 * Created by singhgu on 2/6/2019.
 */
public class validateParenthesis20 {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(ch == ')' && !stack.isEmpty()){
                if(stack.peek() == '(' )
                    stack.pop();
                else
                    return false;
            }
            else if(ch == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{' )
                    stack.pop();
                else
                    return false;
            }
            else if(ch == ']' && !stack.isEmpty()) {
                if (stack.peek() == '[' )
                    stack.pop();
                else
                    return false;
            }
            else
                return false;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args){System.out.println(isValid("["));}
}
