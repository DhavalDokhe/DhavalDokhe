package Exception;

import java.util.Scanner;

public class Age1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        a=scanner.nextInt();

        if (a < 18) {
            System.out.println("your not eligible for vote");
        }else {
            System.out.println("vote succesfully");
        }
    }
}
