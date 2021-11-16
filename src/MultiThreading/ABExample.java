package MultiThreading;

public class ABExample {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        setNum(10);
    }
}
class C implements Runnable{

    @Override
    public void run() {
      while (true){
          System.out.println();
      }
    }
}
class D implements Runnable{

    @Override
    public void run() {

    }
}
class main1{
    public static void main(String[] args) {
        ABExample obj = new ABExample();
        Thread t1 = new Thread((Runnable) obj);
        t1.start();
        System.out.println(obj.getNum());
    }
    }