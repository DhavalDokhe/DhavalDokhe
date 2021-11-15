package Abstraction;
//abstraction class using abstraction method


abstract class Animal {
    void legs()
    {
        System.out.println("all animal have 4 legs");
    }
    abstract void sound();
    abstract void eat();
    }
    class dog extends Animal
    {
        void sound()
        {
            System.out.println("bow bow");
        }
        void eat()
        {
            System.out.println("meet");
        }
}
class absclass
{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();   d.eat();   d.legs();
    }
}
