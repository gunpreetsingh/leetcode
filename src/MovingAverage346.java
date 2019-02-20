import java.util.*;
import java.util.LinkedList;

/**
 * Created by singhgu on 2/18/2019.
 */
public class MovingAverage346 {
    Queue<Integer> queue;
    int maxSize;
    double sum;

    public MovingAverage346(int size) {
        queue = new LinkedList<Integer>();
        maxSize = size;
        sum = 0.0;
    }

    public double next(int val) {
        if(queue.size() == maxSize){
            sum = sum - queue.peek();
            queue.remove();
        }
        queue.add(val);
        sum = sum + val;
        return sum / queue.size();
    }

    public static void main(String[] args){
        MovingAverage346 obj = new MovingAverage346(3);

    }
}
