import java.util.*;
public class Priority_Queue {
    public static void main(String args[]){
        /*Priority Queue is a FIFO data structure that serves elements with
        * the highest priority first before elements with the lower priority*/
        Queue<Double> queue = new PriorityQueue<Double>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
