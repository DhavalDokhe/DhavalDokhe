package Assignment;

import java.util.Scanner;

public class Assignment38 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number range ");
        num1=scanner.nextInt();
        System.out.println("enter the second number range ");
        num2=scanner.nextInt();

        System.out.println("The even number in range of  "+num1+" and "+num2);
        for (int i=num1;i<=num2;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("the odd number between  "+num1+" and  "+num2);
        for (int i=num1;i<=num2;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
