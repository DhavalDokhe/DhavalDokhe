package ControlFlowstatement.Whileloop;

import java.util.Scanner;

public class WhileDoDeno {

    public static void main(String[] args) {
        int guessnumber;
        int num=(int)(Math.random()*100)+1;

        Scanner s=new Scanner(System.in);
        do {
            System.out.println("enter the number");
            guessnumber = s.nextInt();

            if (num < guessnumber) {
                System.out.println("Number is greater");
            } else if (num > guessnumber) {
                System.out.println("Number is smaller");
            } else {
                System.out.println("Number is correct");
            }
        }while (num!=guessnumber);
    }
}
