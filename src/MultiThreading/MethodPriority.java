package MultiThreading;

public class MethodPriority {
    public static void main(String[] args) {
     A obj =new A();
     B obj1=new B();

     obj1.setPriority(Thread.MAX_PRIORITY);
     obj.setPriority(1);                      //1,5,10 are normal , medium and high priority.

     obj.start();
     obj1.start();
    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("In a run");
    }
}
class B extends Thread{
    @Override
    public void run() {
        System.out.println("In b run ");
    }
}