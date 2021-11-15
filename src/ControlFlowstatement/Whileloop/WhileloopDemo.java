package ControlFlowstatement.Whileloop;

public class WhileloopDemo {
    public static void main(String[] args)
    {
        int i=1;             //initialization

        while (i<=10)          //condition
       {
        System.out.println(i);
            i++;                       //incremental decremental
        }
////
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
