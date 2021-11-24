package StringDemo;

import java.util.Locale;

public class ConversionString {
    public static void main(String[] args) {
        String s="dhaval";
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.toLowerCase());

        int a=10,b=20;
        String str1=String.valueOf(a);
        String str2=String.valueOf(b);
        System.out.println(str1+str2);

        char[] c=s.toCharArray();
        System.out.println(c);

    }
}
