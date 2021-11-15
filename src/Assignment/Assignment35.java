package Assignment;

import java.util.Scanner;

public class Assignment35 {
    public static void main(String[] args) {
        int no;int fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no");
        no=scanner.nextInt();

        for (int i=1; i<=no;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
