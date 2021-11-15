package MultiThreading;

public class MultiThreading extends Thread {

 public  void run(){
     for (int i=1;i<=5;i++){
         System.out.println("hii");
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }
}
class Hello implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        MultiThreading obj=new MultiThreading();
        obj.start();

        Hello hello=new Hello();
        Thread t1=new Thread(hello);
        t1.start();
    }
}
