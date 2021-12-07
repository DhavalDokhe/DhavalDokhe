package Collection;

import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> first =new java.util.HashSet<>();
        first.addAll(Arrays.asList(new Integer[]{1,2,6,6,9,5}));

        Set<Integer> Second =new java.util.HashSet<>();
        Second.addAll(Arrays.asList(new Integer[]{1,2,3,4,7}));

        //get the union.
        Set<Integer> union=new java.util.HashSet<>(first);
        union.addAll(Second);
        System.out.println(union);

        //get the intersection
        Set<Integer> intersection =new java.util.HashSet<>(first);
        intersection.retainAll(Second);
        System.out.println(intersection);

        //get the differnce
        Set<Integer> difference=new java.util.HashSet<>(first);
        difference.removeAll(Second);
        System.out.println(difference);

    }
}
