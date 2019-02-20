import java.util.Stack;

/**
 * Created by singhgu on 2/18/2019.
 */
public class plusOne66 {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack();
        int carry = 1;
        int sum = 0;
        for(int i = digits.length -1; i>=0; i--){
            sum = carry + digits[i];
            carry = 0;
            if(sum > 9)
                carry = sum / 10;
            stack.push(sum % 10);
        }

        if(carry != 0)
            stack.push(carry);

        int[] arr = new int[stack.size()];
        for(int i = 0; i< arr.length; i++)
            arr[i] = stack.pop();
        return arr;
    }

}
