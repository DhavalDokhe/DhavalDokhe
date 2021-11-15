package ThisKeyword;

public class ThisDemo {
    int i;

    void setValue(int i){
        this.i=i;

    }
    void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.setValue(200);
        t.show();
    }
}
