package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emplyoees {

        int id;
        String name;
        String address;

    @Override
    public String toString() {
        return "Emplyoees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Emplyoees(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Emplyoees obj1=new Emplyoees(1,"dhaval","pune");
        Emplyoees obj2=new Emplyoees(2,"gannu","mumbai");
        Emplyoees obj3=new Emplyoees(1,"ram","nashik");

        List<Emplyoees> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        //Collections.sort(list);

        list.forEach(s->{
            System.out.println(s);
        });
    }
    public int compareTo(Emplyoees emplyoees){
        if (this.id==emplyoees.id){
            return  0;
        }else if (this.id>emplyoees.id){
            return 1;
        }else {
            return -1;
        }
    }
}
