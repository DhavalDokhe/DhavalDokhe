package MultiThreading;

public class ThreadMethod {
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());    //get the name of that thread set by java.


       Thread t1=new Thread(()->{
          System.out.println(Thread.currentThread().getName());
//           System.out.println(Thread.currentThread().isAlive());
   });
    /*    t1.setName("Dhaval");                     //Set the name for thread(name).
        System.out.println(t1.getId());             //set the id for thread.
        System.out.println(t1.isDaemon());         //test the thread is daemon or not.Daemon is working thread which is continuosly work at background.
        System.out.println(t1.getState());
     */
        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
    }
}
