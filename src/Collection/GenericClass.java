package Collection;

public class GenericClass<T> {
    private  T t;

    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t=t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> obj=new GenericClass<>();
        obj.setT(20);
        System.out.println(obj.getT());

        GenericClass<String > obj1=new GenericClass<>();
        obj1.setT("Dhaval");
        System.out.println(obj1.getT());
    }
}
