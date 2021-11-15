package ControlFlowstatement;

import java.util.Scanner;

public class DowhileLoop {
    public static void main(String[] args) {
        int num;
        int sum=0;
        char choice;

        Scanner s=new Scanner(System.in);

        do {
            System.out.println("enter the  value");
            num=s.nextInt();
            sum=num+ sum;
                System.out.println("Do you want to continue");
                choice=s.next().charAt(0);
            }while (choice=='Y' || choice=='y');

            System.out.println(sum);
        }

        }


