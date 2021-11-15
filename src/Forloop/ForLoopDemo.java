package Forloop;

public class ForLoopDemo {
    public static void main(String[] args) {


        //simple for loop statement
      //  for (int i=1;i<=10;i++){
        //    System.out.println(i);


        int arr[]=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
//traditional for loop
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


        //enhanced for loop

        for(int i:arr){
            System.out.println(i);
        }

    }
}
