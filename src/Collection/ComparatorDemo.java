package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;
    String name;
    String address;

//    @Override
//    public String toString() {
//        return "ComparatorDemo{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", comparator=" + comparator +
//                ", comparator1=" + comparator1 +
//                '}';
//    }

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public static void main(String[] args) {
        ComparatorDemo obj1 = new ComparatorDemo(1, "dhaval", "pune ");
        ComparatorDemo obj2 = new ComparatorDemo(2, "pankaj", "satara ");
        ComparatorDemo obj3 = new ComparatorDemo(3, "mayur", "mumbai");

        List<ComparatorDemo> comparatorDemos = new ArrayList<>();
        comparatorDemos.add(obj1);
        comparatorDemos.add(obj2);
        comparatorDemos.add(obj3);


        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if (o1.id == o2.id) {
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Comparator<ComparatorDemo> comparator1 = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(comparatorDemos, comparator.thenComparing(comparator1));

        comparatorDemos.forEach(s->{
            System.out.println(s.id+""+s.name+""+s.address);
        });

    }

}
