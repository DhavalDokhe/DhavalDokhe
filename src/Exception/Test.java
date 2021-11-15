package Exception;

public class Test {
    public static void main(String[] args) {
      //  int a=100;
      //  int b=0;
        //int c;
       // c=a/b;
        //System.out.println(c);

      //  String name=null;
       // System.out.println(name.length());

        try{
            System.out.println("1");
            System.out.println("2");
            int a=100;
            int b=0;
            int c=a/b;
            System.out.println("3");
            System.out.println(c);
            System.out.println("4");
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
