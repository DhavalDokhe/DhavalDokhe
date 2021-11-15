package Assignment;
//count the number of digit of number
public class Assignment36 {
    public static void main(String[] args) {
        int  count =0,no=12364578;
        while (no!=0){
            no/=10;
            count++;
        }
        System.out.println("number of digit is  "+count);
    }
}
