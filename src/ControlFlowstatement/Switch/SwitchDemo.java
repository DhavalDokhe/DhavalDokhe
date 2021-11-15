package ControlFlowstatement.Switch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        i=s.nextInt();

        switch (i){
            case 1:
                int j=0;
                System.out.println("Enter value");
                j=s.nextInt();
                switch (j){
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 20:
                        System.out.println("Twenty");
                        break;
                    default:
                        System.out.println("Not matched");
                }
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
