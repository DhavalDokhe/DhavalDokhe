package Constructor;

public class Student4 {
    int rollno;
    String name;
    int age;

    Student4(int i,String n){
        rollno=i;
        name=n;

    }
    Student4(int i,String n,int a){
        rollno=i;
        name =n;
        age=a;
    }
    void show(){
        System.out.println(rollno+"  "+name+"  "+age);
    }

    public static void main(String[] args) {
        Student4 S1=new Student4(231,"Dhaval");
        Student4 S2=new Student4(545,"Dhaval",23);
        S1.show();
        S2.show();
    }
}
