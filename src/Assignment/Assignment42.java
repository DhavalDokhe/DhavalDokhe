package Assignment;

public class Assignment42 {
    public static void main(String[] args) {
        int no = 5;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (i + j >= no + 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("");
                }
            }                System.out.println();

        }
    }
}