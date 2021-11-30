package Collection;

import java.util.ArrayList;  //arraylist we can store n number of value there is no limitation

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList.size());   //size of array list
        System.out.println(arrayList.get(3));   //get the value from an index.

        //to print the value from an array list used 1.for() loop.2.Iterator.

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //Generics concept
        ArrayList<Integer> arrayList1=new ArrayList<>();    //we can store only integer value now because we the integer as generic
        arrayList1.add(100);
        arrayList1.add(200);
    }
}
