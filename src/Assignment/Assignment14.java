package Assignment;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {


    int i;
    Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        i=scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("day is monday");
                break;
            case 2:
                System.out.println("day is tuesday");
                break;
            case 3:
                System.out.println("day is wednesday");
                break;
            case 4:
                System.out.println("day is thurday");
                break;
            case 5:
                System.out.println("day is friday");
                break;
            case 6:
                System.out.println("day is saturday");
                break;
            case 7:
                System.out.println("day is sunday");
                break;
            default:
                System.out.println("invalid");
        }
}}
