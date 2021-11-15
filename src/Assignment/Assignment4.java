package Assignment;

public class Assignment4
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;

        //using third variable c=a;a=b;b=a;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a +" "+b);
    }
}
