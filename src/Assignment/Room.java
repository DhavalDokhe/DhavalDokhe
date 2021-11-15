package Assignment;

public class Room {
    int length,height,width;
    Room(int length,int height,int width){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    public void whiteWashingArea(){
        float area =length*width*height;
        System.out.println("area of whitewashed is ==> "+ area+"sq.foot");
    }
    public void whiteWashingCost(){
        float cost=(length*height*width)/80;
        System.out.println("cost of whitewashed area is ==>  "+cost);
    }
    public void flooringCost(){
        float geometric =(length*width)/200;
        float cement=(height*width)/100;
        System.out.println("the flooring cost for geometric flooring is ==> "+geometric);
        System.out.println("the flooring cost for cement flooring is ==>"+cement);
    }

    public static void main(String[] args) {
        Room obj=new Room(100,200,150);
        obj.whiteWashingArea();
        obj.whiteWashingCost();obj.flooringCost();
    }
}
