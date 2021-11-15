package Exception;

public class TestThrow {
    public static void validate(int age){
        if (age<18){
            throw new ArithmeticException("person is not to validate to vote");
        }else {
            System.out.println("person can vote");
        }
    }

    public static void main(String[] args) {
        validate(16);
        System.out.println("rest of the code");
    }

}
