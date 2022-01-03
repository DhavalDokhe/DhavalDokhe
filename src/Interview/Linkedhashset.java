package Interview;

import java.util.LinkedHashSet;

 class Book {
    int id;
    String name,author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class Linkedhashset{
    public static void main(String[] args) {
        LinkedHashSet<Book> linkedHashSet=new LinkedHashSet<Book>();
        Book b1=new Book(101,"Let us c","yashwant","textmax",100);
        Book b2=new Book(120,"Ramayan","Maharshi vyas","Hanuman",500);
        Book b3=new Book(156,"Mahabharat","valmiki","Ganesha",1000);

        linkedHashSet.add(b1);
        linkedHashSet.add(b2);
        linkedHashSet.add(b3);

        for (Book b:linkedHashSet){
            System.out.println(b.id+" "+b.name+" "+b.quantity+" "+b.author+" "+b.publisher);
        }
    }
}
