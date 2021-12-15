package Java8;
//if you want multiple inheritance through interface then implement the interface to class and override the method.
interface MyInterface6 {
    String msg();

    default int add(int i, int j) {        //for default method
        return i + j;
    }
    static  String display(){             //For static method
        return "In display Method";
    }
}
interface  MyInterface7{
    String msg();

    default int add(int i, int j) {
        return i + j;
}}

public class DefaultAndStatic implements MyInterface6 ,MyInterface7{
    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();

        System.out.println(obj.add(5, 8));

       // System.out.println(MyInterface6.display()); //for static method.

    }

    public String msg() {
        return "msg";
    }

    @Override
    public int add(int i, int j) {
        return MyInterface6.super.add(i, j);
    }
}
