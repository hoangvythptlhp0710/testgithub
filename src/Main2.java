import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args){
        // Queue = FIFO data structure - First In First Out (ex: a line of people)
        //         A collection designed for holding elements prior to processing
        //         Linear data stucture
        //
        //         add = enqueue, offer()
        //         remove = dequeue, poll()
        Queue<String> queue1 = new LinkedList<String>();
        System.out.println(queue1.isEmpty());
        queue1.offer("An");
        queue1.offer("Binh");
        queue1.offer("Chi");
        queue1.offer("Dung");

        System.out.println(queue1.peek());
        //queue1.poll();
        //queue1.poll();
        //queue1.poll();
        //queue1.poll();
        System.out.println(queue1.size());
        System.out.println(queue1);
    }
}
