package Assignment;

public class Assignment45 {
    public static void main(String[] args) {
        int no = 5;
        for (int i = 1; i <= no; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(" "+j);
                } else {
                    System.out.print( "");
                }
            }
            System.out.println();
        }
    }}