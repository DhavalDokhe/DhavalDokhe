package MultiThreading.StaticSyncDemo;


class BookTheaterSeat{
 static int total_seat=20;
  static synchronized void bookseat(int seats){
        if (total_seat>=seats){
            System.out.println(seats+ "seat book succesfully ");
            total_seat=total_seat-seats;
            System.out.println("seats left "+total_seat);
        }
        else {
            System.out.println("seat cannot be book");
            System.out.println("seat left "+total_seat);
        }

    }
}
class MyThread1 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookseat(seats);
    }
}
class MyThread2 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookseat(seats);
    }
}
public class MovieBookApp {
    public static void main(String[] args) {
        BookTheaterSeat b1=new BookTheaterSeat();
        MyThread1 t1=new MyThread1(b1,7);
        t1.start();
        MyThread2 t2=new MyThread2(b1,8);
        t2.start();

        BookTheaterSeat b2=new BookTheaterSeat();
        MyThread1 t3=new MyThread1(b2,5);
        t3.start();
        MyThread2 t4=new MyThread2(b2,4);
        t4.start();

    }
}
