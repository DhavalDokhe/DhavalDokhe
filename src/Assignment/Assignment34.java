package Assignment;

import java.util.Scanner;

public class Assignment34 {
    public static void main(String[] args) {
        int no;int count=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        no=scanner.nextInt();

        for (int i=2; i<no;i++){
            if (no%i==0){
                count=count+1;
            }
        }if (count>=2){
            System.out.println(no+  "is not a  prime no");
        }
        else {
            System.out.println(no +"  is  prime no");
        }
    }
}
