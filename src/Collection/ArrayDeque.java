package Collection;

import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.offer(50);

//        System.out.println(deque.removeFirst());  //remove the first value
//        System.out.println(deque.removeLast());   //remove the last value
        System.out.println(deque.poll());   //used to remove the head when no element poll shows the null
//       // System.out.println(deque.remove());  //remove show the exception
//        System.out.println(deque.pop());      //pop remove the element
//        //System.out.println(deque.descendingIterator());    //starting from  last
//
//        System.out.println(deque.peek());   //peek return the head
//        System.out.println(deque.peekFirst());  //return last head
//        System.out.println(deque.peekLast());   //return last head
//        System.out.println(deque.removeFirstOccurrence(30));  //
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//        System.out.println(deque);

        Iterator<Integer> it = deque.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
