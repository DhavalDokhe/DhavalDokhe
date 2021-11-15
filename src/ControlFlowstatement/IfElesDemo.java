package ControlFlowstatement;

import java.util.Scanner;

public class IfElesDemo {
    public static void main(String[] args) {
        int age;
        String nationality;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        age=scanner.nextInt();
        System.out.println("nationality");
        nationality=scanner.next();

        if(age>18){
            if (nationality.equals("Indian")){
                System.out.println("you can vote");
            }
            else {
                System.out.println("not Indian");
            }
        }
        else if(age<18){
            System.out.println("you cant vote");
        }


    /*   int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }*/
    }
}
