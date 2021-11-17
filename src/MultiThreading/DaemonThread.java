package MultiThreading;

public class DaemonThread extends Thread
{
    @Override
    public void run() {

            System.out.println(Thread.currentThread().isDaemon());
            System.out.println("Child Thread");

    }

    public static void main(String[] args)
    {
        System.out.println("main Thread");
        DaemonThread t =new DaemonThread();
        t.setDaemon(true);
        t.start();
    }
}


