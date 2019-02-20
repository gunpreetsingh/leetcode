import java.util.Stack;

/**
 * Created by singhgu on 2/18/2019.
 */
public class QueueUsingStacks232 {
    Stack<Integer> stackEnqueue = new Stack();
    Stack<Integer> stackDequeue = new Stack();
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackEnqueue.push(x);
        System.out.println(stackEnqueue.peek());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int popElement = 0;
        if(stackDequeue.isEmpty()){
            while(!stackEnqueue.isEmpty())
                stackDequeue.push(stackEnqueue.pop());
            popElement = stackDequeue.pop();
        }
        else
            popElement = stackDequeue.pop();
        return popElement;
    }

    /** Get the front element. */
    public int peek() {
        int peekElement = 0;
        if(stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty())
                stackDequeue.push(stackEnqueue.pop());
            peekElement = stackDequeue.peek();
        }
        else
            peekElement = stackDequeue.peek();
        return peekElement;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (stackEnqueue.isEmpty() && stackDequeue.isEmpty());
    }

    public static void main(String[] args){
        QueueUsingStacks232 obj = new QueueUsingStacks232();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        //obj.push(3);
        //obj.push(4);
        //obj.push(5);
        obj.pop();
        System.out.println(obj.empty());
        //obj.pop();
        //System.out.println(obj.pop());
       // System.out.println(obj.peek());
        //System.out.println(obj.pop());
        //System.out.println(obj.peek());

    }

}
