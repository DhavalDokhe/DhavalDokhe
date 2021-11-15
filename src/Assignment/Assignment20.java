package Assignment;

import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the a value");
        a=scanner.nextInt();
        System.out.println("enter the b value");
        b=scanner.nextInt();
        if (a>b){
            System.out.println("a is maximum and b is minimum");
    }
        else if (a<b){
            System.out.println("b is maximum and a is minimum");
        }
        }
}
