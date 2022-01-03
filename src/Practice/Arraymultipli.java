package Practice;

import java.util.ArrayList;
import java.util.List;

public class Arraymultipli {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int j= list1.size()-1;
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)*list1.get(j));
            j--;
        }
    }
}
