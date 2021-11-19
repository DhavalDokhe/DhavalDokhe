package MultiThreading;

class BookTheaterSeats{
    int total_seats=10;
    int seats;
 synchronized void BookSeat(int seats){
         if (total_seats>=seats){
             System.out.println("seats book successfully");
             total_seats=total_seats-seats;
             System.out.println("seats left "+total_seats);
         }else {
             System.out.println("sorry seats cannot be booked");
             System.out.println("seats left are "+total_seats);
         }
    }
}


public class MovieBooking extends Thread {
   static BookTheaterSeats b;
    int seats;
    @Override
    public void run() {
        b.BookSeat(seats);
    }

    public static void main(String[] args) {
       b= new BookTheaterSeats();

       MovieBooking Dhaval=new MovieBooking();
       Dhaval.seats=7;
       Dhaval.start();

       MovieBooking Mayur =new MovieBooking();
       Mayur.seats=6;
       Mayur.start();
    }
}
