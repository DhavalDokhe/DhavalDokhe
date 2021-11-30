package Collection;

import java.util.ArrayList;
import java.util.Iterator;
//Differnt ways to iterating an arraylist.
public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvseries=new ArrayList<>();
        tvseries.add("mirzapur");
        tvseries.add("patal lok");
        tvseries.add("game of thrones");
        tvseries.add("hellwound");
        tvseries.add("arya");

        tvseries.forEach(shows->{
            System.out.println(shows);
        });

        System.out.println("******* print using iterator");
        Iterator<String> it =tvseries.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("***Foreachremaining method");
        it=tvseries.iterator();
        it.forEachRemaining(shows->{
            System.out.println(shows);
        });

        System.out.println("**for advance for each");
        for (String str:tvseries){
            System.out.println(str);
        }
    }
}
