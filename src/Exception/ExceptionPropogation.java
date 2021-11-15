package Exception;

public class ExceptionPropogation {
    public void a(){
        int i=10;                          //only checked exception is propogated.unchecked exception is not propogated.
        int j=i/0;
        System.out.println(j);              //to handle exception used try and catch compulsory.
    }
    public  void b()
    {
        a();
    }
    public void c(){
        try {
            b();
        }catch (ArithmeticException e){
            System.out.println("Exception handled");
        }

    }

    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        obj.c();
    }
}
