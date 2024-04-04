import java.util.*;

public class Deposit {
    static Scanner dk=new Scanner(System.in);
    public static int Amnt;

    public static void  AmntDeposit(){
        System.out.println("Enter the Amount to Deposit");
        System.out.println("Entered must be of denomination 100,200 & 500");
        Amnt= 0;
        Amnt=dk.nextInt();
        if(Amnt%100==0 || Amnt%200==0 || Amnt%500==0){
            System.out.println("Amount Deposit Successfully");
            continueTrans.Continue();
        }
        else{
            System.out.println("Condition Missmatch");
            System.out.println("Try Again");
            AmntDeposit();
        }
    }

    public static void main(String[] args) {
        AmntDeposit();
    }
}
