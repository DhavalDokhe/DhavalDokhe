package Assignment;

import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        int cp,sp,loss,profit;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the cost price");
        cp=scanner.nextInt();
        System.out.println("enter the selling price");
        sp=scanner.nextInt();

        if (cp>sp){
            loss=cp-sp;
            System.out.println("loss is==> "+loss);
        }else {
            profit=sp-cp;
            System.out.println("profit is ==>  "+profit);
        }
    }
}
