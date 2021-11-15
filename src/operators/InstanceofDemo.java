package operators;
interface Myinterface{

}


public class InstanceofDemo implements Myinterface {
    public void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {
        InstanceofDemo obj =new InstanceofDemo();
        if(obj instanceof Myinterface ){
            obj.show();
        }
    }


}
