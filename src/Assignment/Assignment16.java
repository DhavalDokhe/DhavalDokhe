package Assignment;
                    //calculation of total light bill.
import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        double unit;
        double grossunit,bill;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the unit");
        unit=s.nextInt();
        double firstfifty=50*0.5;
        double next100=100*0.75;
        double next100100=100*1.20;
        double above250=250*1.5;

        if (unit<50){
             bill=unit*0.5;
            grossunit=bill+(bill*0.2);
            System.out.println("grossunit is ==> "+grossunit);
        }
        else if (unit>50&&unit<150){
             bill=firstfifty+((unit-50)*0.75);
             grossunit=bill+(bill*0.2);
            System.out.println("grossunit is==>"+grossunit);

        }
        else if (unit>150&&unit<250){
             bill=firstfifty+next100+((unit-150)*1.2);
             grossunit=bill+(bill*0.2);
            System.out.println("grossunit is ==> "+grossunit);
        }else{
             bill=firstfifty+next100+next100100+((unit-250)*1.5);
            grossunit=bill+(bill*0.2);
            System.out.println("grossunit is==> "+grossunit);
        }
    }

}
