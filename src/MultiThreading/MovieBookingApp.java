package MultiThreading;

class TotalEarning extends Thread {
    int total = 0;

    @Override
    public void run() {

        synchronized (this) {

            for (int i = 1; i <= 10; i++)
            {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class MovieBookingApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning te = new TotalEarning();
        te.start();
        // System.out.println("total earning is : "+te.total+"rs");

        synchronized (te) {
            te.wait();
            System.out.println("total earning is " + te.total + " rs");
        }
    }
}
