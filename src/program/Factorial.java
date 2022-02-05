package program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        int no=5;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no");
        int no=scanner.nextInt();
        int fact=1;
        for (int i=1;i<=no;i++){
            fact=fact*i;

        }System.out.println("factorial of 5 is "+fact);
    }
}
