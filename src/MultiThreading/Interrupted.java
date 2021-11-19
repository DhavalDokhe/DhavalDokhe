package MultiThreading;

public class Interrupted extends Thread{

    @Override
    public void run()
    {


        try {

            for (int i=1;i<=5;i++){
            System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    public static void main(String[] args) {
        InterruptThread t=new InterruptThread();
        t.start();t.interrupt();
       // System.out.println(t.isInterrupted());
        System.out.println(t.isInterrupted());

    }
}
