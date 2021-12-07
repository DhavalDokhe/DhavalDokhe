package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
//Remove the duplicate element from list.
public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,77));

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(number);

        ArrayList<Integer> arrayList=new ArrayList<>(linkedHashSet);
        System.out.println(arrayList);
    }
}
