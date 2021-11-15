package Assignment;
            //leap year or not
import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the year");
        year=scanner.nextInt();

        if (year%4==0){
            System.out.println("year is leap year");
        }
        else {
            System.out.println("normal year");
        }

    }
}
