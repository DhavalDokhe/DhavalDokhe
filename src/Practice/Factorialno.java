package Practice;

import java.util.Scanner;

//find the factorial number of 5=5*4*3*2*1=120
                            //      for using i++ starting from last 1
public class Factorialno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no");
        int no=s.nextInt();
        int fact=1;
     //   for (int i=1;i<=no;i++){
       //     fact=fact*i;

        for (int i=no;i>=1;i--){                          //for i-- starting from first
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
