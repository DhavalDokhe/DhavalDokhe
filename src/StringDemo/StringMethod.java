package StringDemo;

public class StringMethod {
    public static void main(String[] args) {
        //length() method
//
//       String name ="abc";
//       String email="abc@123";
//
//        System.out.println(name.length());
//        System.out.println(email.length());

        //isEmpty Method
        String name = "";
        String email = "   ";
        boolean b = name.isEmpty();
        if (b == true) {

            System.out.println(b);
        }else {
            System.out.println("valid name");
        }
    }
}

