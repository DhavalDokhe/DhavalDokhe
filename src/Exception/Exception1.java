package Exception;

public class Exception1 {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        try{
            int c=i/j;
            String str =null;
            System.out.println(str.toLowerCase());
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            try {
                int d=i/2;
                System.out.println(d);
            }catch (ArithmeticException arithmeticException){
                arithmeticException.printStackTrace();
            }
        }finally {
            System.out.println("In final");
        }
        System.out.println("hii");
    }
}
