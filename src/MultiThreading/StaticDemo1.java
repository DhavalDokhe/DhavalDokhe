package MultiThreading;

public class StaticDemo1 {

  static   int num;

    public static void main(String[] args) throws InterruptedException {

        StaticDemo1 obj = new StaticDemo1();
        StaticDemo1 obj1 = new StaticDemo1();

        Thread T1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increase();
            }
        });

        Thread T2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increase();
            }
        });
        Thread T3 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj1.increase();
            }
        });
        Thread T4 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj1.increase();
            }
        });

        T1.start();
        T2.start();
        T3.start();
        T4.start();

        T1.join();
        T2.join();
        T3.join();
        T4.join();
        System.out.println("num ==>" + num);
    }

    public synchronized void increase() {
        synchronized (StaticDemo1.class) {
            num++;
        }
    }
}
