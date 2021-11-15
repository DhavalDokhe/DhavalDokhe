package Oops.Polymorphism;
                                  //method overloading
public class TestOverloading {
    void show(int a,int b){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        TestOverloading t =new TestOverloading();
        t.show(10,20);
    }
}
