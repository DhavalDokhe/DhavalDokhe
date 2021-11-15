package ControlFlowstatement;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        int age=15;
        if(age>18){
            System.out.println("age is greater then 18");
        }
        else{
            System.out.println("age is less then 18");
        }


        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        a= s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }


        int marks;
        Scanner m= new Scanner(System.in);
        System.out.println("Enter the marks");
        marks=m.nextInt();

        if(marks>50 && marks<60){
            System.out.println("D grade");
        }
        else if (marks>60 && marks<70){
            System.out.println("C grade");
        }
        else if (marks>70 & marks<80){
            System.out.println("B grade");
        }
        else if (marks>80 && marks<100){
            System.out.println("A grade");
        }
        else {
            System.out.println("fail");
        }
    }
}
