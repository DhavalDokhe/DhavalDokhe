package StringDemo;

public class AdditionString {
    public static void main(String[] args) {
        String s1="Dhaval";
        String s2="Java";
        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+s1+20);
        System.out.println(10+20+s1);

        System.out.println(s1.concat(s2));
        System.out.println(String.join(";",s1,s2));
    }
}
