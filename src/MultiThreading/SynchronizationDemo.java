package MultiThreading;

public class SynchronizationDemo {
    int num;


    public synchronized void increase() {
        num++;

    }

    public static void main(String[] args) throws InterruptedException{

        SynchronizationDemo obj=new SynchronizationDemo();

        Thread T1=new Thread(()->{
            for (int i=1;i<=1000;i++) {
                obj.increase();
            }
            });

        Thread T2=new Thread(()->{
            for (int i=1;i<=1000;i++){
                obj.increase();
            }
        });
        T1.start();
        T2.start();

        T1.join();
        T2.join();
        System.out.println("num ==>"+obj.num);
        }
    }
