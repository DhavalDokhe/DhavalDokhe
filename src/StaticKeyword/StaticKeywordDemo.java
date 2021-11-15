package StaticKeyword;

public class StaticKeywordDemo {
    int empId;
    String emoName;
    static String companyName = "ABC";

    public StaticKeywordDemo(int empId,String empName){
        this.empId=empId;
        this.emoName=empName;
        System.out.println("id=>"+ empId +  "+ empName==> "+ empName +"  +companyName==>"+companyName);
    }

    public static void main(String[] args) {
        StaticKeywordDemo obj1= new StaticKeywordDemo(1,"akash");
        StaticKeywordDemo obj2=new StaticKeywordDemo(2,"Dhaval");
        StaticKeywordDemo obj3=new StaticKeywordDemo(3,"mayur");

    }
}
