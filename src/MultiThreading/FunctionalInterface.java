package MultiThreading;

@java.lang.FunctionalInterface
interface Myinterface1 {
    Integer add(int a, int b);

}

public class FunctionalInterface {
    public static void main(String[] args) {

        Myinterface1 obj = (int a, int b) ->{
                return a + b;
        };

        System.out.println(obj.add(2, 5));

    }
}