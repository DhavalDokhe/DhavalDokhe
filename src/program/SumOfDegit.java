package program;

public class SumOfDegit {
    public static void main(String[] args) {
        int no=741;
        int rem;
        int sum=0;

        while (no>0){
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.println(sum);
    }
}
