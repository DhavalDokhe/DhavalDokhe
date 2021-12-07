package Collection;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>();
        treeMap.put(300, "dhaval");
        treeMap.put(200, "Sahil");
        treeMap.put(400, "mayur");
        treeMap.put(100, "sham");

//treemap follow the natural ascending/decending order.

        // System.out.println(treeMap);

        treeMap.forEach((k, v) -> {
            System.out.println("key==>" + k + " " + "value " + v);
        });
//        System.out.println(treeMap.lastKey()); //return the last value of key.
//        System.out.println(treeMap.firstKey());  //return the first value of key.
//        System.out.println(treeMap.firstEntry()); //showing both first key and value.
////        System.out.println(treeMap.remove(100)); //remove the key
//        System.out.println(treeMap.ceilingEntry(200));   //show the smaller or greater value of key value
//        System.out.println(treeMap.ceilingKey(250));
//        System.out.println(treeMap.floorEntry(250));
//        System.out.println(treeMap.lowerEntry(200));  //show the before value
//        System.out.println(treeMap.higherEntry(300));  //show the next value
//        System.out.println(treeMap.ceilingKey(201));
        System.out.println(treeMap.subMap(100, 300));
        System.out.println(treeMap.tailMap(300, true));
        System.out.println(treeMap.descendingMap());
    }
}
