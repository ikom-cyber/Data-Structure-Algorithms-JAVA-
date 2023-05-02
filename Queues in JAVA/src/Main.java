import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
    /*
    * Queue is a FIFO data structure (First in First out)
    * a collection designed for holding elements prior to procxessing linear Data structure
    * add = enqueue , offer()
    * remove = dequeue, poll()*/
        Queue<String> queue = new LinkedList<>();
        queue.offer("Andrew");
        queue.offer("Tristan");
        queue.offer("hamza");
        queue.offer("chad");
        System.out.println("Queuse before removing data");
        System.out.println(queue);
        queue.poll();
        System.out.println("Queue after removing elements");
        System.out.println(queue);
        //System.out.println(queue.isEmpty()); to check if queue is empty
        //System.out.println(queue.size()); to check the size pf the queue
        //System.out.println(queue.contains("Harold"); to check if a queue contains a certain element

    }
}