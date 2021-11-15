package Assignment;
//Assignment 52

public class Student {
    int rollno;
    String name;
    long contactno;
    int total;

   public Student(int rollno,String name,long contactno,int total){
    this.rollno=rollno;
    this.name=name;
    this.contactno=contactno;
    this.total=total;
    }
    void display(){
        System.out.println("rollno is  ==>"+rollno+" name is ==>"+name+"contactno is ==>"+contactno+"total marks is==>"+total);
    }
}
