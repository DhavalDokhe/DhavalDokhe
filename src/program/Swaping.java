package program;

public class Swaping {
    public static void main(String[] args) {
        int a=10,b=20;
        //with third variable
//        int t;
//        t=a;
//        a=b;
//        b=t;

//        without third variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("swapping of a is "+a);
        System.out.println("swapping of b is "+b);
    }
}
