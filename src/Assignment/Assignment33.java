package Assignment;

import java.util.Scanner;

public class Assignment33 {
    public static void main(String[] args) {
        int t;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the table number");
        t=scanner.nextInt();
        for (int i=1;i<=10; i++){
            int table=i*t;
            System.out.println(table);
        }
    }
}
