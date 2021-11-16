package MultiThreading;

public class ThreadClass1 extends Thread{

    public void run()
    {
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        ThreadClass1 t=new ThreadClass1();
        t.start();
    }
}
