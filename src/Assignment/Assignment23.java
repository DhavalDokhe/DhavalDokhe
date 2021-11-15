package Assignment;

import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the a value ");
        a=scanner.nextInt();
        System.out.println("enter the b value ");
        b=scanner.nextInt();
        System.out.println("enter the c value ");
        c=scanner.nextInt();

     if(a==b&&b==c){
         System.out.println("equilateral triangle");
     }
     else if (a==b||b==c||c==a){
         System.out.println("isosceles triangle");

     }
     else {
         System.out.println("scalene triangle");
     }
    }
}
