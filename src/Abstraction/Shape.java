package Abstraction;

abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw Circle");
    }

    public static void main(String[] args) {
        Shape R=new Circle();
        R.draw();
    }
}