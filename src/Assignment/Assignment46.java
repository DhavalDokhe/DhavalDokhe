package Assignment;

public class Assignment46 {
    public static void main(String[] args) {
        int result=1;
        int no=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i>=j){
                    System.out.print("  "+result++);
                }
            }
            System.out.println();
        }
    }
}
