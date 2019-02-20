import leetcode.MinNode;

import java.util.Stack;

/**
 * Created by singhgu on 2/11/2019.
 */
public class MinStack {
    Stack<MinNode> stack = new Stack();
    int minimum;
//    Stack<Integer> minStack = new Stack();
//
//    public void push(int x) {
//        if(minStack.isEmpty())
//           minStack.push(x);
//        else {
//            if (x < minStack.peek())
//                minStack.push(x);
//        }
//        stack.push(x);
//    }
//
//    public void pop() {
//        if(!stack.isEmpty() && !minStack.isEmpty()){
//            if(stack.peek() == minStack.peek()){
//                stack.pop();
//                minStack.pop();
//            }
//            else
//                stack.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin(){
//        return minStack.peek();
//    }

    public void push(int x){
        MinNode node = new MinNode();
        if(stack.isEmpty())
            minimum = x;
        if(!stack.isEmpty() && x < minimum)
            minimum = x;
        node.val = x;
        node.min = minimum;
        stack.push(node);
        System.out.println(stack.peek().val + " , " + stack.peek().min);
    }

    public void pop(){
        if(!stack.isEmpty()) {
            stack.pop();
            if(!stack.isEmpty())
                minimum = stack.peek().min;
        }
    }

    public int top(){
        return stack.peek().val;
    }

    public int getMin(){
        return stack.peek().min;
    }

    public static void main(String[] args){

        MinStack obj = new MinStack();
        obj.push(-10);
        obj.push(14);
        obj.push(-20);
        obj.pop();
        obj.push(10);
        obj.push(-7);
        obj.push(-7);
        obj.pop();
        obj.pop();

        //obj.push(0);

    }

}
