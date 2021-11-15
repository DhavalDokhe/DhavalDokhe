package SuperKeyword;

public class SuperKeywordDemo {
    int i=90;

    public void display(){
        System.out.println("In display parent");
    }
    public SuperKeywordDemo(){
        System.out.println("In parent constructor");
    }

}
class A extends SuperKeywordDemo{
    int i=100;
    public A(){
        System.out.println("In child constructor");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Jai Shree Ram");
    }

    public static void main(String[] args) {
        A obj =new A();
        System.out.println(obj.i);
        obj.show();
        obj.display();
    }
    public void show(){
        System.out.println(super.i);
    }
}