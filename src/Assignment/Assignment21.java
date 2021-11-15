package Assignment;


import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {


        char alphabet;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Alphabet");
        alphabet=scanner.next().charAt(0);


        if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'){
            System.out.println("enter character "+alphabet  +"   is vowel");
        }
        else {
            System.out.println("enter character "+alphabet  +"    is consonant");
        }
    }
}
