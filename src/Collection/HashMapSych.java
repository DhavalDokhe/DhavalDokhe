package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSych {
    public static void main(String[] args) {

        //synchronized method in collection class.
        HashMap<Integer,String > hashMap=new HashMap<>();
        hashMap.put(1,"dhaval");
        hashMap.put(2,"sham");
        hashMap.put(3,"ram");

        //creat the sychronized map.
        Map<Integer,String > map= Collections.synchronizedMap(hashMap);
        System.out.println(map);

        //ConcurrentHash Map; it does not throw any ConcurrentModification exception.
        ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put(4,"mayur");
        concurrentHashMap.put(5,"pranit");
        concurrentHashMap.put(6,"ganesh");

        System.out.println(concurrentHashMap.get(4));
    }
}
