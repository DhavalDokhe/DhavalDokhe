package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

//find out least and most salary employee.
public class EmployeePriority {
    int id;
    int Salary;


    public EmployeePriority(int id, int salary) {
        this.id = id;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePriority{" +
                "id='" + id + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }

}

class EmpCoparator implements Comparator<EmployeePriority> {

    public int compare(EmployeePriority e1, EmployeePriority e2) {
        return e2.Salary - e1.Salary;                            //for more salary and e1-e2 for least salary.
    }

}

class PriorityObject {
    public static void main(String[] args) {
        EmpCoparator coparator = new EmpCoparator();
        EmployeePriority o1 = new EmployeePriority(5, 5000);
        EmployeePriority o2 = new EmployeePriority(6, 6000);
        EmployeePriority o3 = new EmployeePriority(7, 500);
        EmployeePriority o4 = new EmployeePriority(8, 9000);

        PriorityQueue<EmployeePriority> str = new PriorityQueue<>(10, coparator);
        str.add(o1);
        str.add(o2);
        str.add(o3);
        str.add(o4);

        System.out.println(str.poll());     //remove as per condition.like least or big number .
        System.out.println(str);
    }

}

