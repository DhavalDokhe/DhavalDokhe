package Assignment;
//Assignment 53


import java.util.Scanner;

public class AccountManagement {
    String name;
    long accountNo,balance;
    Scanner obj=new Scanner(System.in);

    public void insertData(){
        System.out.println("enter the account holder name ");
        name=obj.next();
        System.out.println("enter the account number ");
        accountNo=obj.nextLong();
        System.out.println("enter the account balance");
        balance=obj.nextLong();
    }
    public void displayData(){
        System.out.println("Name of account holder is  ==> "+name);
        System.out.println("account number is ==> "+accountNo);
        System.out.println("account balance is ==> "+balance);
    }

    public void depositAmount(){
        long depositAmount;
        System.out.println("enter the deposit amount ");
        depositAmount=obj.nextLong();
        balance=balance+depositAmount;
        System.out.println("total account balance is ==> "+balance);
    }
    public void withdrawAmount(){
        long withdraw;
        System.out.println("enter the withdraw amount ");
        withdraw=obj.nextLong();
        if (withdraw>balance){
            System.out.println("insufficient balance");
        }else {
            System.out.println("you have withdraw amount of  =="+withdraw+ "And net balanace is "+(balance-withdraw));
        }

    }
    public void accountBalance(){
        System.out.println("The net balance is =="+balance);
    }

    public static void main(String[] args) {
        AccountManagement obj=new AccountManagement();
        obj.insertData();
        int i;
        System.out.println("for checking balance press 1 =="+'\n'+"for deposit amount press 2 "+'\n'+"for withdraw amount press 3 "+'\n'+"for display data press 4");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the press no");
         i=scanner.nextInt();

        switch (i){
            case  1 :
                obj.accountBalance();
                break;
            case 2:
                obj.depositAmount();
                break;
            case 3:
                obj.withdrawAmount();
            case 4:
                obj.displayData();
                break;
            default:
                System.out.println("invalid data");
        }
    }
}
