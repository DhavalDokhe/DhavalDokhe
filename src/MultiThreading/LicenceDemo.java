package MultiThreading;


public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical medical=new Medical();
        medical.start();
        medical.join();

        TestDrive testDrive=new TestDrive();
        testDrive.start();
        testDrive.join();

        OfficeSign officeSign=new OfficeSign();
        officeSign.start();
    }

}
  class Medical extends Thread{
       @Override
       public void run() {
           System.out.println("medical starts");
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("medical completed");
       }
   }
   class TestDrive extends Thread{
       @Override
       public void run() {
           System.out.println("test drive starts");
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("test drive end");
       }
   }
   class OfficeSign extends Thread{
       @Override
       public void run() {
           System.out.println("Officer checking file ");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("officer sign the file");
       }
   }



