package Assignment;

import java.util.Scanner;

public class Assignment39 {
    public static void main(String[] args) {
        int no=121;int temp=no;
        int rev=0;int rem;

        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (no==rev){
            System.out.println(no  +"  is palindrome no");
        }
        else {
            System.out.println(no   +"  is not a palindrome no");
        }
    }
}
