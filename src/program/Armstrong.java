package program;

public class Armstrong {
    public static void main(String[] args) {
        int no=153;
        int temp=no;
        int rev=0;
        int rem;
        while (temp !=0){
            rem=temp%10;
            rev=rev+(rem*rem*rem);
            temp=temp/10;
        }
        if (rev==no){
            System.out.println("no is armstrong");
        }else {
            System.out.println("not a armstrong");
        }
    }
}
