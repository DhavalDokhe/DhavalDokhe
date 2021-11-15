package ControlFlowstatement.Switch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int no1;
        int no2;
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first no");
        no1=s.nextInt();
        System.out.println("enter the second no");
        no2=s.nextInt();
        System.out.println("enter the symbol");
        ch=s.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println( no1+no2);
                break;
            case '-':
                System.out.println( no1-no2);
                break;
            case '*':
                System.out.println( no1*no2);
                break;
            case '/':
                System.out.println(no1/no2);
                break;
            default:
                System.out.println("invalid number");

        }
    }
}
