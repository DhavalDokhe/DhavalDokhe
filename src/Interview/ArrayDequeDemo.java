package Interview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("whaval");
        deque.add("ganesh");
        deque.add("sham");
        deque.add("ram");
        deque.offer("nnnna");
        deque.poll();
        deque.pop();
        deque.peek();

        Iterator<String> iterator=deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
