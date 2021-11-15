package StaticKeyword;

public class Student {
    int rollno;
    String name;
   static String School="Codekul";

   Student(int rollno,String name){
       this.rollno=rollno;
       this.name=name;
   }
   void display()
   {
       System.out.println(rollno+"   "+name+"   "+School);
   }

    public static void main(String[] args) {
        Student s1=new Student(25,"Rahul");
        Student S2=new Student(30,"Amol");
        s1.display();
        S2.display();
    }
}
