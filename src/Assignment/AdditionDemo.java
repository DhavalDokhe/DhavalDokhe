package Assignment;

public class AdditionDemo {
    //Assignment 50

    int number1 = 4;
    int number2 = 2;
    int result;

    public void addition() {
        result = number1 + number2;
        System.out.println("addition is "+result);
    }

    public void subtraction() {
        result = number1 - number2;
        System.out.println("subtraction is "+result);
    }

    public void multiplication() {
        result = number1 * number2;
        System.out.println("multiplication is  "+result);
    }

    public void division() {
        result = number1 / number2;
        System.out.println("division is "+result);
    }

}
class Addition{
    public static void main(String[] args) {
        AdditionDemo obj=new AdditionDemo();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
