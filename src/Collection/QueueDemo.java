package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();        //queue is first in first out.
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek());     //return head or null
        System.out.println(queue.offer(50));
        System.out.println(queue.remove());      //remove head in queue
        System.out.println(queue.element());    //element returns head value or exception
        System.out.println(queue.poll());       //
        System.out.println(queue);
        System.out.println(queue.hashCode());
        System.out.println(queue.isEmpty());
    }
}
