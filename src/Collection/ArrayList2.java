package Collection;

import java.util.ArrayList;
import java.util.List;

//calling two arraylist  in one iteration.

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        iterate(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        iterate(list2);
    }
    public static void iterate(List<?>list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
