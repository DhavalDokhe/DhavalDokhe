package StringDemo;

public class IgnoreCase {
    public static void main(String[] args) {
        String s="My Name Is Dhaval";
        String s1="my name is dhaval";

        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
    }
}
