import java.util.Stack;

/**
 * Created by singhgu on 2/10/2019.
 */
public class backspaceCompare844 {

    public static boolean backspaceCompare(String S, String T){
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        if(S.length() == 0 && T.length() == 0)
            return true;

        int length1 = S.length();
        int length2 = T.length();

        for(int i = 0; i <  length1; i++){
            if(S.charAt(i) == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
            }
            else
                stack1.push(S.charAt(i));
        }
        int stackSize1 = stack1.size();
        for(int i = 0; i <stackSize1; i++)
            str1.append(stack1.pop());

        for(int i = 0; i <  length2; i++){
            if(T.charAt(i) == '#') {
                if (!stack2.isEmpty())
                    stack2.pop();
            }
            else
                stack2.push(T.charAt(i));
        }

        int stackSize2 = stack2.size();
        for(int i = 0; i <stackSize2; i++)
            str2.append(stack2.pop());


        if(str1.toString().equals(str2.toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
       if(backspaceCompare("xywrrmp", "xywrrmu#p"))
           System.out.print("true");
        else
           System.out.print("false");
    }
}

