package MultiThreading;

public class YieldMethod extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }

    public static void main(String[] args) {
        YieldMethod t=new YieldMethod();
        t.start();
       //Thread.yield =if ou want to stop main method and provides chance to other thread for execution.
        for (int i=1;i<=5;i++){
            Thread.yield();
            System.out.println("main Thread "+i);
        }
    }
}
