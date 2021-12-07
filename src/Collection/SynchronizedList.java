package Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//how to synchroized arrays list in java (Thread safe).interview

public class SynchronizedList {
    public static void main(String[] args) {
        //1.using synchronized method
        List<String > listname = Collections.synchronizedList(new ArrayList<String >());

        listname.add("Python");
        listname.add("C++");
        listname.add("java");

        synchronized (listname){
            Iterator<String > iterator=listname.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
        //2.copyonwriteArrayList method
        CopyOnWriteArrayList<String > arrayList=new CopyOnWriteArrayList<>();
        arrayList.add("ram");
        arrayList.add("kam");
        arrayList.add("sham");

        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
