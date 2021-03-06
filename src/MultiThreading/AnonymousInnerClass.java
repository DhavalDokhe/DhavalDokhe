package MultiThreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface obj =new MyInterface() {
            @Override
            public Integer add(int a, int b) {
                return a+b;
            }

            @Override
            public Integer sub(int a, int b) {
                return a-b;
            }
        };
        System.out.println(obj.add(5,5));
    }
}
interface  MyInterface{
    Integer add(int a,int b);
    Integer sub(int a,int b);

}