package Collection;


import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"pune");
        map.put(2,"mumbai");
        map.put(3,"nagpur");

        map.forEach((k,v)->{
            System.out.println("key==>"+k+"value==>"+v);
        });

        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println("key==>"+m.getKey()+"value==>"+m.getValue());
        }

    }
}
//key is unique it cannot be store duplicate value.