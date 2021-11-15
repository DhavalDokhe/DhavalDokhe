package Abstraction;

public interface Vehical {
    String name="TVS";    //public+static+final
    int speed=100;        //public+static+final

    void start();       //public +abstract bydefault
    void stop();
}
class Customer implements Vehical{
    @Override
    public void start()
    {
        System.out.println("start(): insert key & press start button" );
    }

    @Override
    public void stop()
    {
        System.out.println("stop(): outside the key"  );
    }

    public static void main(String[] args)
    {
        Customer c=new Customer();
        c.start();     c.stop();
        System.out.println(name+  speed);
    }
}
