package Practice;

public class ArmstrongNo {
    public static void main(String[] args) {
        int number=153;
        int a=number;
        int res=0;
        int reminder;

        while (a>0){
            reminder=a%10;
            res=res+ reminder*reminder*reminder;
            a=a/10;
        }
        if (number==res){
            System.out.println("The given number is armstrong number ");
        }else {
            System.out.println("Not armstrong number");
        }
    }
}
