package ThisKeyword;

public class ThisKeywordDemo {
    int id;
    String name;
    String address;

    public void setValues(int id1,String name1, String address1){
       id=id1;
       name=name1;
       address=address1;
    }
public void show(){
    System.out.println("In show function");
}
public void display(){
        this.show();
}
    public static void main(String[] args) {
        ThisKeywordDemo obj=new ThisKeywordDemo();
        obj.setValues(1, "Prakash"," Nagpur" );
        System.out.println("id=>" +obj.id+" name=>"+obj.name+"address=>"+obj.address);
        obj.show();
    }
}
