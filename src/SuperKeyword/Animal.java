package SuperKeyword;

public class Animal {
    String Colour=" white";

}
class dog extends Animal{
    String Colour =" Black";
            public void printColour(){
                System.out.println(Colour);
                System.out.println(super.Colour);
            }

    public static void main(String[] args) {
        dog obj=new dog();
        obj.printColour();
    }
}
