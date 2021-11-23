package FinalKeyword;

public class FinalKeywordDemo {
  final   int i;           //constant

  //final Ulhas.variable=it used to declare the value.
  //final method= if you declare as final then you cannot override this method.
  //final class= if ypu declare final class then it cannot be inherites.
  public FinalKeywordDemo(){
      i=10;
  }

    public void display(){
        //i=20;

    }

    public static void main(String[] args) {
        FinalKeywordDemo F=new FinalKeywordDemo();
        F.display();
        System.out.println(F.i);
    }
}
class Test extends FinalKeywordDemo{
    @Override
    public void display() {
        System.out.println("in display");
    }
}
