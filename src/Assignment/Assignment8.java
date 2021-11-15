package Assignment;

import java.util.Scanner;
                                   //area and perimeter of circle.
public class Assignment8 {
    public static void main(String[] args) {
        int r;
        double area,perimeter;
        double pi=3.142;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of radius");
        r=scanner.nextInt();

        area= (pi*r*r);
        perimeter=(2*pi*r);

        System.out.println("  area of circle is==>  "+  area   +   "perimeter of circle==>"   +perimeter);

    }
}
