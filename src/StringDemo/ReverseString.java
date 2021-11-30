package StringDemo;

public class ReverseString {
    public static void main(String[] args) {

//        String str="Welcome";
//        StringBuilder str1=new StringBuilder(str);
//       // str1.reverse();
//        System.out.println(str1.reverse());

        String obj = "Dhaval ";
        String rev = "";

        for (int i = obj.length() -1; i >= 0; i--) {
            //  System.out.print(obj.charAt(i));            //rev=rev+obj.charat(i);
            rev = rev + obj.charAt(i);
        }
        System.out.println(rev);
    }
}
