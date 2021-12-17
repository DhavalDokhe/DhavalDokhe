package Java8.StreamAPI;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionDemo {
    public static void main(String[] args) throws Exception {
        Employee obj = new Employee(1, "Dhaval", null);
        System.out.println(obj.getEmail());

        if (obj.getEmail() != null) {
            System.out.println(obj.getEmail().toLowerCase());
        } else {
            System.out.println("Email is null");
        }

        Optional<Employee> optional = Optional.empty(); //empty optional.
        Employee obj1 = new Employee(2, "ram", null);
//      Optional<String> optional1 =Optional.of(obj.getEmail());  //return exception when optional is null
//      System.out.println(optional1);

        Optional<String > optional2 =Optional.ofNullable(obj.getEmail());  //return empty when optional is null
        System.out.println(optional2);

        Optional<String > optional3 =Optional.ofNullable(obj.getEmail());
        System.out.println(optional3.orElse("Optional is null"));

        Optional<String > optional4 =Optional.ofNullable(obj.getEmail());
        System.out.println(optional4.orElseGet(()->{
            return "Optional is null";
        }));


        Optional<String > optional5 =Optional.ofNullable(obj.getEmail());
        System.out.println(optional5.orElseThrow(()->{
            return  new Exception("In Exception");
        }));
//
//        Optional<String > optional6 =Optional.ofNullable(obj.getEmail());
//        System.out.println(optional6.orElseThrow());



    }
}
class Employee{
  int id;
  String Name;
    String email;
    public Employee(int id, String name, String email) {
        this.id = id;
        Name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
