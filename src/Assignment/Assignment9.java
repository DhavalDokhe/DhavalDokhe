package Assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {


    int l;
    int w;
    int area,perimeter;

    Scanner s=new Scanner(System.in);
        System.out.println("enter the length");
        l=s.nextInt();
        System.out.println("enter the width");
        w=s.nextInt();

        area=l*w;
        perimeter=2*(l*w);
        System.out.println("  area of rectangle is==>  "+area + "  perimeter of area is ==>  "+perimeter);
}
}
