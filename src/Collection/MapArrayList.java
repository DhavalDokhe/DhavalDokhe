package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapArrayList {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"India ");
        map1.put(2,"Rus ");
        map1.put(3,"Us ");
        map1.put(4,"Aus ");

        Map<Integer,String> map2=new HashMap<>();
        map2.put(1,"India ");
        map2.put(2,"Rus ");
        map2.put(3,"Us ");
        map2.put(4,"Aus ");


        Map<Integer,String> map3=new HashMap<>();
        map3.put(1,"India ");
        map3.put(2,"Rus ");
        map3.put(3,"Us ");
        map3.put(4,"Aus ");

        List<Map<Integer,String>> list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

//        list.forEach(s->{
//            s.forEach((k,v)->{
//                System.out.println("key==> "+k+"value ==>"+v);
//            });
//        });
        //using enhanced for loop
        for (int i=0;i<list.size();i++){
            for (Map.Entry<Integer,String > m:list.get(i).entrySet()){
                System.out.println("key==> "+m.getKey()+"value ==> "+m.getValue());
            }
        }
    }
}
