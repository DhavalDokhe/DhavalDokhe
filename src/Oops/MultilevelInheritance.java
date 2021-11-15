package Oops;
           //multilevel and hiararchical
public class MultilevelInheritance {

    void showA(){
        System.out.println("a class method");
    }
}
class B extends MultilevelInheritance{

    void showB(){

        System.out.println("b class method ");
    }
}
class C extends MultilevelInheritance{
    void showC()
    {
        System.out.println("c class method ");
    }

    public static void main(String[] args) {
        MultilevelInheritance obj1=new MultilevelInheritance();
        obj1.showA();
        B obj2=new B();
        obj2.showA();
        obj2.showB();
        C obj3=new C();
        obj3.showC();
        obj3.showA();
    }
}
