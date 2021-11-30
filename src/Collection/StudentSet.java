package Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentSet {
    String  name;
    String address;

    StudentSet(String name,String address){
        this.name=name;
        this.address=address;

       // System.out.println("name "+name+ "address "+address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSet that = (StudentSet) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    public static void main(String[] args) {
        StudentSet s1=new StudentSet("Dhaval","pune ");
        StudentSet s2=new StudentSet("Dhaval","pune ");
        StudentSet s3=new StudentSet("Dhaval","pune ");

        Set<StudentSet> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        set.forEach(shows->{
            System.out.println(shows.name+"   " +shows.address);
        });
    }
}
