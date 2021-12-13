package Java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        //method refer to instance variable
       MethodReferences obj=new MethodReferences();
       //refer
        MyInterface3 myInterface3=obj::msg;
        //call
        System.out.println(myInterface3.display());

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.forEach(System.out::println);  //shortcut of lambda function
    }
    public  String msg(){
        return "Hello";
    }
}
@FunctionalInterface
interface MyInterface3{
    String display();
}
