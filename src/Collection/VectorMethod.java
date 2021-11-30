package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println(vector.hashCode());
        System.out.println(vector.size());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(4));
        System.out.println(vector);

        Vector<Integer> vector1=new Vector<>();
        vector1.add(60);
        vector1.add(70);
        vector1.add(80);

        vector.addAll(vector1);
        System.out.println(vector);

        for (Integer e:vector1){
            System.out.println(vector1);
        }
        for (int i=0;i<vector.size();i++){
            System.out.println(vector.get(i));
        }
        Collections.sort(vector);
        System.out.println(vector);

    }
}
