package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StudentMap {
     int marks;
     String name;

    public StudentMap(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    public static void main(String[] args) {
        StudentMap studentMap=new StudentMap(54,"Ramesh");
        StudentMap studentMap1=new StudentMap(34,"Mohan");
        StudentMap studentMap2=new StudentMap(75,"Shreyas");
        StudentMap studentMap3=new StudentMap(34,"Amol");

        List<StudentMap> list=new ArrayList<>();
        list.add(studentMap);
        list.add(studentMap1);
        list.add(studentMap2);
        list.add(studentMap3);

        list.stream().filter(s->s.marks==34).map(ss->ss.marks+1).forEach(System.out::println);
                //forEach( System.out::println);

        list.forEach(d->{
            System.out.println(d.name+"  "+d.marks);
        });
    }
}
