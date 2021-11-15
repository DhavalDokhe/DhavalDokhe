package Assignment;

public class Square57 {

    void calculateArea(int length){

    int area =length*length;
        System.out.println("area of square is  "+area);
    }
}
class SquareDemo{
    public static void main(String[] args) {
        Square57 obj=new Square57();
        obj.calculateArea(10);
    }
}