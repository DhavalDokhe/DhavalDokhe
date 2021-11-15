package Exception;
 //we can handle exception using try and catch so abnormal termination is not occure .
//if we dont use try and catch then output is get but abnormally terminated.


public class Tets1 {
    void divide(){
        try {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tets1 t=new Tets1();
        t.divide();
        System.out.println("hello");
    }
}
