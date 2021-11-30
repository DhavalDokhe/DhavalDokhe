package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//set not following insertion order
                                             //set not store the duplicate value.
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(70);
        set1.add(50);
        set1.add(20);

        Set<Integer>  set2=new TreeSet<>();
        set2.add(40);
        set2.add(90);
        set2.add(50);

        System.out.println(set2);

        set.containsAll(set1);
            System.out.println(set);

    }
}
