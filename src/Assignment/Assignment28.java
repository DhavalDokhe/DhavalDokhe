package Assignment;

import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the marks of sub1");
        sub1=scanner.nextInt();
        System.out.println("enter the marks of sub2");
        sub2=scanner.nextInt();
        System.out.println("enter the marks of sub3");
        sub3=scanner.nextInt();
        System.out.println("enter the marks of sub4");
        sub4=scanner.nextInt();
        System.out.println("enter the marks of sub5");
        sub5=scanner.nextInt();

        int sum=sub1+sub2+sub3+sub4+sub5;
        System.out.println("sum of 5 subject is ==> " +sum);
        double percentage=sum/5;
        System.out.println("percentage is ==>  "+percentage);


        if (percentage>=90){
            System.out.println("grade is A");
        }
        else if (percentage>=80&&percentage<=89){
            System.out.println("grade is B");
        }
        else if (percentage>=70&&percentage<=79){
            System.out.println("grade is C");
        }
        else if(percentage>=60&&percentage<=69){
            System.out.println("grade is D");
        }
        else if (percentage>=40&&percentage<=59){
            System.out.println("grade is E");
        }
        else {
            System.out.println("grade is f");
        }
    }
}
