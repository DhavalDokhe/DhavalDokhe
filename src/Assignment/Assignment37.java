package Assignment;

import java.util.Scanner;

public class Assignment37 {
    public static void main(String[] args) {
        int num,digit,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        num=scanner.nextInt();

        while (num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("sum of digit is  "+ sum);
    }
}
