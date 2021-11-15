package Exception;

public class UnderAgeException extends RuntimeException{                //for checked exception used only Exception and
                                                                //for unchecked exception used RunTimeException
    UnderAgeException()
    {
        super("you are under age");
    }
    UnderAgeException(String msg){
        super(msg);
    }
}
class voting{
    public static void main(String[] args) {

        int age = 17;
        try {

            if (age < 18) {
                throw new UnderAgeException("you can not vote because you are under age");
            }
            else {
                System.out.println("you can vote");
            }
        } catch (UnderAgeException e) {
           // e.printStackTrace();
            System.out.println(e);
        }
    }  }