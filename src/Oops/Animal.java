package Oops;

public class Animal {
    public void eat()
    {
        System.out.println("Im eating");
    }
    public void run(){
        System.out.println("Im running");
    }

    public static void main(String[] args) {
        Animal dog =new Animal();
        dog.eat();dog.run();
        bird s=new bird();
        s.fly();
    }
}
class bird{
    public void fly(){
        System.out.println("Im flying ");
    }
}
