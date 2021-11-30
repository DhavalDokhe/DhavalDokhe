package Collection;

import java.util.LinkedList;
import java.util.List;

public class ArrayMultiplication {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2=new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

         int j=list2.size()-1;

        for (int i=0;i<=list1.size()-1;i++){
            System.out.println(list1.get(i)*list2.get(j));
            j--;
            }
        }
    }

