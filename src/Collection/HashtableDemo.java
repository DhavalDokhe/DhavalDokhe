package Collection;

import java.util.Hashtable;
//hashtable is synchronized .thrad safe
//store the value on the basis of key and value pair format
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put(1,"dhaval");
        hashtable.put(2,"sham");
        hashtable.put(3,"ram");


//create the clone copy/shallow copy.
        Hashtable hashtable1=new Hashtable();
        hashtable1=(Hashtable)hashtable.clone();

        hashtable.clear();     //clear the value of hashtable
        System.out.println(hashtable);
        System.out.println(hashtable1);

  //contain the value.
        Hashtable str=new Hashtable();
        str.put("a","dhaval");
        str.put("b","sham");
        str.put("c","ram");

        if (str.contains("dhaval"))
            System.out.println("value is found ");


    }
}
