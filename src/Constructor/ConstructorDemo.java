package Constructor;

public class ConstructorDemo {

    public ConstructorDemo(){
        System.out.println("In constructor");
    }
    public ConstructorDemo(int i){
        System.out.println("In constructor"+i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo(20);
        ConstructorDemo obj1 =new ConstructorDemo();
    }
}
