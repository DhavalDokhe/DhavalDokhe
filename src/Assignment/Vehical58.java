package Assignment;

public class Vehical58 {
    String colour;
    int Wheel;
    int gear;

    Vehical58(String colour){
        this.colour=colour;
    }
    Vehical58(String colour,int wheel,int gear) {
        this.colour = colour;
        this.Wheel = wheel;
        this.gear = gear;
    }
    void show(){
        System.out.println(colour+"  "+Wheel+" "+gear);
    }

    public static void main(String[] args) {
        Vehical58 obj1=new Vehical58("black");
        Vehical58 obj2=new Vehical58("black",4,8);
        obj1.show();
        obj2.show();
    }
}
