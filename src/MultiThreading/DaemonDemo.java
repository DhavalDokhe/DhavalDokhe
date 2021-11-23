package MultiThreading;

public class DaemonDemo extends Thread {

    public static void main(String[] args) {
        DaemonThread obj = new DaemonThread();
        obj.setDaemon(true);   //write before the start method.
        obj.start();

        System.out.println(obj.isDaemon());
        System.out.println("in main method");
    }

    @Override
    public void run() {
        System.out.println("in run method");
    }
}
