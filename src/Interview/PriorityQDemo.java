package Interview;

import java.util.PriorityQueue;

public class PriorityQDemo {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("Ram");
        priorityQueue.add("sham");
        priorityQueue.add("ganesh");
        priorityQueue.add("hanuman");

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());
    }
}
