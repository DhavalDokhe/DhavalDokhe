package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i=10;
        int j=2;
        try{
            int c=i/j;
            try {
                String str=null;
                System.out.println(str.toLowerCase());
            }catch (NullPointerException e){
                System.out.println(e);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Hii");
    }
}
