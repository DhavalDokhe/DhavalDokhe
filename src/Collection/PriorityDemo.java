package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("mumbai");
        queue.add("nagpur");
        queue.add("nashik");
        queue.add("pune");

        System.out.println(queue.element());
        System.out.println(queue.poll());

        Iterator<String > iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(queue.remove());
        System.out.println(queue.poll());
    }
}
