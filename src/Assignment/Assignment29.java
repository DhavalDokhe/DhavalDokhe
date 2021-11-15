package Assignment;

public class Assignment29 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        for (int i=1;i<=100;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
