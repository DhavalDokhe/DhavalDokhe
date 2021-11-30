package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        System.out.println(list.size());

        list.add("dhaval");  //0
        list.add("ram");//1
        list.add("Mayur");//2
        list.add("ganesh");//3


        System.out.println(list.size());
        System.out.println(list);

        Iterator<String > it  =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        list.add(4,"aalu");
        System.out.println(list);

        list.add(2,"vaibhav");
        System.out.println(list);

        LinkedList<String > users=new LinkedList<>();
        users.add("kunal");
        users.add("ajinkya");

        list.addAll(users);
        System.out.println(list);

        list.addFirst("trump tatya");
        list.addLast("biden anna");
        System.out.println(list);

        //reverse the linkedlist
        Iterator<String > ii=list.descendingIterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }


    }
}
