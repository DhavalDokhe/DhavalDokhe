package ControlFlowstatement;

public class IfElseExample {
    public static void main(String[] args) {
        int number=14;

        if(number%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
class IfElsenew {
    public static void main(String[] args) {
        int year=2016;

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("odd year");
        }
    }

}