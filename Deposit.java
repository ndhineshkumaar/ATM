import java.util.*;

public class Deposit {
    static Scanner dk=new Scanner(System.in);
    public static double Amnt;
    static HashMap <Integer,User> userData=User.data;

    public static void  AmntDeposit(){
        System.out.println("Enter the Amount to Deposit");
        System.out.println("Entered must be of denomination 100,200 & 500");
        Amnt=dk.nextInt();
        User user=userData.get(login.username);
        if(Amnt%100==0 || Amnt%200==0 || Amnt%500==0){
            user.deposit(Amnt);
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
