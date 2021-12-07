package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {
    int id;
    String name;
    int Salary;

    ComparableDemo(int id, String name, int Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public static void main(String[] args) {
        ComparableDemo obj1 = new ComparableDemo(10, "dhaval", 50000);
        ComparableDemo obj2 = new ComparableDemo(20, "mayur", 60000);
        ComparableDemo obj3 = new ComparableDemo(40, "aalu", 70000);
        ComparableDemo obj4 = new ComparableDemo(20, "ram", 80000);

        List<ComparableDemo> list = new LinkedList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        Collections.sort(list);
//
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i).id+" "+list.get(i).name+" "+list.get(i).Salary);

        list.forEach(s -> {
            System.out.println(s.id + "  " + s.name + " " + s.Salary);
        });
    }

    @Override
    public int compareTo(ComparableDemo o) {
        if (this.id==o.id){
            return  0;
        }else if (this.id>o.id){
            return 1;
        }else {
            return -1;
        }
    };
}
