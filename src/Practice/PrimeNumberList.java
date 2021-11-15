package Practice;

import java.io.OutputStream;

public class PrimeNumberList {
    public static void main(String[] args) {
           int res = 0;
        for (int no = 1; no <= 100; no++)
        {
            for (int i = 2; i <= no - 1; i++)
            {
                if (no % i == 0)
                {
                    res=res+1;


                }
            }if (res==0){
            System.out.println(no);
        }else {
                res=0;
        }
        }
    }

}