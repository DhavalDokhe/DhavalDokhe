package MultiThreading;

public class Example {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Dhaval");
        System.out.println(Thread.currentThread().getName());
    }
}
