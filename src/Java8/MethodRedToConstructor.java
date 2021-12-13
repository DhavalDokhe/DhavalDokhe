package Java8;

public class MethodRedToConstructor {
    public static void main(String[] args) {
        //ref
        MyInterface5 myInterface5=MethodRedToConstructor::new;
        //call
        myInterface5.methodRef();
    }
    public MethodRedToConstructor(){
        System.out.println("In Constructor");
    }
}
@FunctionalInterface
interface  MyInterface5{
    MethodRedToConstructor methodRef();
}
