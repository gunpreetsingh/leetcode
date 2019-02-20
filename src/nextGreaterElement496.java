import java.util.HashMap;
import java.util.Stack;

/**
 * Created by singhgu on 2/18/2019.
 */
public class nextGreaterElement496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums2.length; i++) {
            if (stack.isEmpty() || (stack.peek() > nums2[i]))
                stack.push(nums2[i]);
            else {
                while ((!stack.isEmpty()) && (stack.peek() < nums2[i]))
                    map.put(stack.pop(), nums2[i]);
                stack.push(nums2[i]);
            }
        }

        if(!stack.isEmpty()){
            while(!stack.isEmpty())
                map.put(stack.pop(), -1);
        }

        for(int i = 0; i< nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args){
        int[] arr = nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});

        for(int v: arr)
            System.out.println(v);
    }
}
