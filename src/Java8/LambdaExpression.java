package Java8;

//Lambda Expression= is anonymous function
//use== It takes less code
//      it is uses to give implementation to functional interface.
//anonymous function is   which doent   consist any name

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface1 myInterface1=()->{
            return "Hello";
        };
        System.out.println(myInterface1.msg());

        MyInterface2 myInterface2=(a,b)->{
          return a+b;
        };
        System.out.println(myInterface2.add(5,6));

        List<Integer> list= Arrays.asList(1,56,6,88,99);

        Consumer<Integer> consumer=(i)->{
            System.out.println(i);
        };
        list.forEach(consumer);
    }
}
@FunctionalInterface
interface MyInterface1{
    String msg();
}
interface MyInterface2{
    int add(int a,int b);
}