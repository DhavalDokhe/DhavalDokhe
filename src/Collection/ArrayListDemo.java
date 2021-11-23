package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);list.add(30);
        list.add(40);


        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(1));

//        list.forEach(s->{
//            System.out.println(s);      //For Iterating list
//        });
//
//        Iterator<Integer> iterator=list.iterator();
//        while (iterator.hasNext()){                    //another way to itrete arraylist
//            System.out.println(iterator.next());
//        }
//
//        List<Integer> list1= Arrays.asList(10,20,30);    //create array list
//        System.out.println(list1);
//
//        List<Integer> list2=new ArrayList<>(List.of(10,20,235,552));     //create the array list
//        System.out.println(list2);
//
//        List<Integer> list3=new ArrayList<>(){{               //create the array list
//            add(20);
//            add(30);
//            add(40);
//        }};
//        System.out.println(list3);
//
//
//        List<Integer> list4=new ArrayList<>(Arrays.asList(10,30,5055,40));     //create the array list
//        System.out.println(list4);
    }
}
