package Assignment;

import java.util.Scanner;

//program to display total marks and avg of 6 subject.
public class Assignment12 {
    public static void main(String[] args) {


        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int total;
        float avg;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the a marks ");
        a=s.nextInt();
        System.out.println("enter the b marks ");
        b=s.nextInt();
        System.out.println("enter the c marks ");
        c=s.nextInt();
        System.out.println("enter the d marks ");
        d=s.nextInt();
        System.out.println("enter the e marks ");
        e=s.nextInt();
        System.out.println("enter the f marks ");
        f=s.nextInt();
        total=(a+b+c+d+e+f);
        System.out.println("total marks is==> "+ total);

        avg=total/6;
        System.out.println("avg marks is ==> "+ avg);





    }}
