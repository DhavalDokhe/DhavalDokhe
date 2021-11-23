package StringDemo;

public class String1 {
    public static void main(String[] args) {

        String str =new String("pune");    //2
        String str1="pune";  //0
        String str2="pune ";  //0                          //==check the reference of string
        String str3="pune";   //0                          //.equal check the content of string
        String str4=new String("pune "); //1

        System.out.println(str==str1);                   //it checks the reference of object.

        System.out.println(str.equalsIgnoreCase(str1));   //content of string.
    }
}
