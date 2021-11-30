package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrrayListMethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1=new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(70);
        list1.add(80);

        list.addAll(list1);           //add the values
       // list.removeAll(list1);     //remove all
        //list.retainAll(list1);     //common between two

        System.out.println(list);
    }
}
