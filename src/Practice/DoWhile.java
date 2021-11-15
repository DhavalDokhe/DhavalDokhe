package Practice;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first no");
            int no1 = s.nextInt();
            System.out.println("Enter the second no");
            int no2 = s.nextInt();
            System.out.println("Select Symbol(+,-,*,/)");
            String Symbol = s.next();
            int res;

            switch (Symbol) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition :" + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction :" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication :" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Division :" + res);
                    break;
                default:
                    System.out.println("invalid symbol");
                    break;

            }
            System.out.println("do u want to continue(y for yes and n for no)");
            yn = s.next();

        } while (yn.equals("y") || yn.equals("y"));
    }
}