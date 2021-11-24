package StringDemo;

public class SubString {
    public static void main(String[] args) {
        String s="this is demo";

        System.out.println(s.substring(3,9));   //subsequence method in which count start from 0 and at 3 position there is s and 9 position is consider as(9-1=8) is s
        System.out.println(s.substring(3));     //subsequence method has two type 1.beginingIndexPosition.
        System.out.println(s.substring(3,11));

        //replace method
        System.out.println(s.replace("is","was"));  //replace method
        System.out.println(s.replaceFirst("is","was"));  //replace first method
        System.out.println(s.replaceAll("is","was"));
        System.out.println(s.replaceAll("is(.)","was"));
    }
}
