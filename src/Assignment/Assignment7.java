package Assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        int a;
        int b;
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=scanner.nextInt();
        System.out.println("enter the value of b");
        b=scanner.nextInt();
        System.out.println("enter the symbol");
        ch=scanner.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid ");

        }
    }
}
