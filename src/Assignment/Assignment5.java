package Assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int days;
        int year;
        int weeks,d1;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the days for conversion");
        days=s.nextInt();
        year=days/365;
        weeks=(days%365)/7;
        d1=(days%365)%7;
        System.out.println("  year " + year+"  weeks "+weeks +"  days "+d1);

    }
}
