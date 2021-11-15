package operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int i=10;
     int   k= 10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i--);

        int j = 3;
        System.out.println(k/j);
        System.out.println(k%j);

        System.out.println(k<<2);
        System.out.println(k>>2);

        if(k==10 || j == 3 ){
            System.out.println(" If executed");

        }
        else{
            System.out.println("else");
        }
    }

}
