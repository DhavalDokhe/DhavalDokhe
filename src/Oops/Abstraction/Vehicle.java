package Oops.Abstraction;
                               //method declare by absrtact and class declare by abstarct must be same.
abstract class Vehicle
{

    abstract void start();            //abstarct method dont have body;

}
class car extends Vehicle{
    void start(){                                        //if we extend abstract class then abstarct method must be implement with body.
        System.out.println("start by using key");
    }
}
class scooter extends Vehicle{
    void start(){
        System.out.println("start b using kick");
    }

    public static void main(String[] args) {
        car c=new car();
        c.start();
        scooter s =new scooter();
        s.start();
    }
}