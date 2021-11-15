package Assignment;

import java.util.Scanner;

public class Assignment30 {
    public static void main(String[] args) {
        int no,power;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        no=scanner.nextInt();
        System.out.println("enter the power");
        power=scanner.nextInt();
        int result=1;
        for (int i=1;i<=power;i++){
            result=result*no;
        }
        System.out.println(result);
    }
}
