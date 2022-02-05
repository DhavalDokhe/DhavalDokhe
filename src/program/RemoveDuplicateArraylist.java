package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>(Arrays.asList(1,2,2,6,4,8,6,7,3,4));

        LinkedHashSet<Integer> list=new LinkedHashSet<>(number);

        ArrayList<Integer> arrayList=new ArrayList<>(list);

        System.out.println(arrayList );
    }
}
