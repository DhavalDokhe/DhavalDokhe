package ClassAndObject;

public class Person {
    int age=21;
    int weight=60;
    String name="Dhaval";
    String color="fair";

    void eat(){
        System.out.println("I'm eating ");
    }
    void sleep(){
        System.out.println("I'm sleeping");
    }

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.age);
        System.out.println(p.color);
        System.out.println(p.weight);
        System.out.println(p.name);
        p.eat();
        p.sleep();
    }
}
