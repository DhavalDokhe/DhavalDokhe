package Collection;

import java.util.LinkedList;
import java.util.List;

public class Employee {
    int id;
    String name;
    int Salary;

    Employee(int id, String name, int Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(10, "dhaval", 50000);
        Employee obj2 = new Employee(20, "mayur", 60000);
        Employee obj3 = new Employee(20, "aalu", 70000);
        Employee obj4 = new Employee(20, "ram", 80000);

        List<Employee> list = new LinkedList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
//
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i).id+" "+list.get(i).name+" "+list.get(i).Salary);

        list.forEach(s -> {
            System.out.println(s.id + "  " + s.name + " " + s.Salary);
        });
    }
}

