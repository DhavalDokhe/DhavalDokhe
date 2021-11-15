package Assignment;

import java.util.Scanner;
                                            //grossSalary =basic +(basic*hra/100)+(basic *dba/100)
public class Assignment15 {
    public static void main(String[] args) {


        int basicSalary;
        double grossSalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the basic salary");
        basicSalary=scanner.nextInt();

        if (basicSalary<=10000){
           grossSalary =basicSalary+(basicSalary*0.8)+(basicSalary*0.2);
            System.out.println("grossSalary is ==> "+grossSalary);
        }
        else if (basicSalary<=20000){
            grossSalary=basicSalary+(basicSalary*0.9)+(basicSalary*0.25);
            System.out.println("grossSalary is ==>"+grossSalary);
        }

        else {
            grossSalary=basicSalary+(basicSalary*0.95)+(basicSalary*0.3);
            System.out.println("grossSalary is ==>"+ grossSalary);
        }

    }
}
