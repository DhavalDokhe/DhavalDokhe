package Assignment;

import java.util.Scanner;

public class Assignment22 {
    public static void main(String[] args) {
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the alphabets");
        ch=s.next().charAt(0);
        if (ch>='A' &&ch<='Z'){
            System.out.println("enter character is  "+  ch   +"   upper case alphabets");
        }
        else if (ch>='a'&&ch<='z'){
            System.out.println("enter character is   "+  ch+   "  lower case alphabets");
        }
    }
}
