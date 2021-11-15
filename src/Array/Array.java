package Array;

public class Array {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=10;                        //for return type outout.
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        for (int i= arr.length-1;i>=0;--i){
            System.out.println(arr[i]);
        }
    }
}
