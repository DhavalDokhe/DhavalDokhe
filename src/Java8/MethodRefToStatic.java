package Java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        //refer
        MyInterface4 myInterface4=MethodRefToStatic::msg;
        //call
        System.out.println(myInterface4.display());
    }
    public static String  msg(){
        return "Hello";
    }
}
@FunctionalInterface
interface  MyInterface4{
    String display();
}
