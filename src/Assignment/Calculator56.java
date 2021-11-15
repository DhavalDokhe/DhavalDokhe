package Assignment;

import java.util.Scanner;

public class Calculator56 {
/*    public static void addition(int num1, int num2){
        return= num1+num2;
    }
    public static void subtraction(int num1,int num2){
        return num1-num2;
    }
    public double multiplication(int num1,int num2){
        return num1*num2;
    }
    public double division(int num1,int num2){
        return num1/num2;
    }

 */

    public static void main(String[] args) {
        Calculator56 obj=new Calculator56();
        Scanner scanner=new Scanner(System .in);
        System.out.println("enter the number1 ");
        int num1=scanner.nextInt();
        System.out.println("enter the number2");
        int num2=scanner.nextInt();

        System.out.println("To perform addition enter 1  \n subtraction enter 2  \n multiplication enter 3  \n division enter 4");
        int choice;
        System.out.println("enter the choice number ");
        choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("The addition is " +num1+num2);
                break;
            case 2:
                System.out.println( num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid case please enter again");
        }
    }

}
