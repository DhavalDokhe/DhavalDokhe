package Practice;

public class ReverseString {
    public static void main(String[] args) {                     //using length =.length()
        String name="dhaval";                                    //charAt(value)=
        String rev="";
        int length=name.length();
        for (int i=length-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
