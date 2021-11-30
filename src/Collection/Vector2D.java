package Collection;

import java.util.Vector;

public class Vector2D {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("java");
        vector.add("JavaScript");
        vector.add("C++");
        vector.add("phython");

        Vector vector1 = new Vector();
        vector1.add(vector);

        for (int i = 0; i < vector.size(); i++) {
            String str = (String) ((Vector) vector1.get(0)).get(i);
            System.out.println(str);
        }

    }
}
