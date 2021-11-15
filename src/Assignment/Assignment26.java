package Assignment;

import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        char character;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character");
        character=scanner.next().charAt(0);

        if (character>='a'&&character<='z'||character>='A'&&character<='Z'){
            System.out.println("character is alphabets");
        }
        else if (character>=0&&character<=9){
            System.out.println("character is number");
        }
        else {
            System.out.println("special character");
        }
    }
}
