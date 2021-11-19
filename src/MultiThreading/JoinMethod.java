package MultiThreading;

public class JoinMethod  extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("child thread "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   

    public static void main(String[] args) throws InterruptedException {
        JoinMethod t =new JoinMethod();
        t.start();
          t.join();

        try {
            for (int i=1;i<=5;i++){
                System.out.println("main thread "+i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
