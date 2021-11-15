package Exception;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        a = scanner.nextInt();
        try {
            if (a < 18) {
                throw new Exception("you are not eligible to vote ");
            } else {
                System.out.println("vote successfully");
            }
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("hello");
    }
}