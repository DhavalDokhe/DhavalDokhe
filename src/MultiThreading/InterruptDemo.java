package MultiThreading;

public class InterruptDemo extends Thread{
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        InterruptThread interruptThread=new InterruptThread();
        interruptThread.start();
        interruptThread.interrupt();

    }
}
