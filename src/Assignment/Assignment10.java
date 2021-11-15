package Assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int a;
        double area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=scanner.nextInt();


       area= (double) ((1.7320/4)*a*a);
        System.out.println("area of equilateral triangle is==>  "+ area);
    }
}
