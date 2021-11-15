package StarPattern;

public class Triangle
{                                //i<=j
                                 //i>=j
                                 //i+j>=n+1
                                 //i+j<=n+1
    public static void main(String[] args)
    {
        int n=4;
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                if (i+j<=n+1 )
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }        System.out.println();

        }

    }
}