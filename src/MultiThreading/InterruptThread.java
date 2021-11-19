package MultiThreading;

public class InterruptThread extends Thread{
    @Override
    public void run() {
       // System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        InterruptThread t =new InterruptThread();
        t.start();
        t.interrupt();

    }
}
