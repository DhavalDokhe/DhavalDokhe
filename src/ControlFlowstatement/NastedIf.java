package ControlFlowstatement;

public class NastedIf {
    public static void main(String[] args) {
        int age=14;
        int weight=65;

        if (age>18){
            if (weight>60){
                System.out.println("you can donate the blood");
            }
            else{
                System.out.println("you cant donate the blood");
            }
        }
        else{
            System.out.println("age must be greater then 18");
        }
    }
}
