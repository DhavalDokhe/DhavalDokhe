package Assignment;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        int no;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no");
        no=scanner.nextInt();
if (no>0){
    System.out.println("no is positive");
}else if (no<0){
    System.out.println("no is negative");
}else {
            System.out.println("no is equal to zero");
}}}