package Assignment;



import java.util.Scanner;

public class Assignment11 {
    //convert degree celsius into Fahrenheit.    formula =(degree*9/5)+32.
    public static void main(String[] args) {

        double d;
        double f;
        double formula1,formula2;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of degree");
        d=s.nextInt();

        formula1=(d*1.8)+32;
        System.out.println(formula1);

        System.out.println("Enter the value of Fahrenheit");
        f=s.nextInt();
        formula2=(f-32)*5/9;
        System.out.println(formula2);
    }
}
