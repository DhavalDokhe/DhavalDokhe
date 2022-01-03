package Interview;

import java.util.Collections;
import java.util.LinkedList;

public class ComparableExample implements Comparable<ComparableExample> {
    int id;
    String name;
    int salary;

    @Override
    public String toString() {
        return "ComparableExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public ComparableExample(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ComparableExample obj1=new ComparableExample(20,"Dhaval",5000);
        ComparableExample obj2=new ComparableExample(10,"sham",8000);
        ComparableExample obj3=new ComparableExample(30,"ram",20000);
        ComparableExample obj4=new ComparableExample(40,"mayur",15000);

        LinkedList<ComparableExample> list=new LinkedList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println(s);
        });
    }


    @Override
    public int compareTo(ComparableExample o) {
        if (this.id==o.id){
            return 0;
        }else if (this.id>o.id){
            return 1;
        }else {
            return -1;
        }
    }
}
