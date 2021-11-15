package Exception;

public class TryNastedBlock {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide by zero");
                int a=40/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try {
                int a[]=new int[5];
                a[5]=4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
