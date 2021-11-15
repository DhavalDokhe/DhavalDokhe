package Assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
       // float p=1000,r=9,n=12;                        //prn/100     :to find the rate of intrest.
       float p,r,n;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the price");
        p=s.nextFloat();
        System.out.println("enter the rate of intrest ");
        r=s.nextFloat();
        System.out.println("enter the period");
        n=s.nextFloat();
        float si=(p*r*n)/100;

        System.out.println(si);                //p=price ,r=rate of intrest,n=period;

    }
}
