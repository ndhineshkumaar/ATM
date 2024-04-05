import java.util.*;

public class Withdraw {

    public static Scanner dk=new Scanner(System.in);
    public static HashMap<Integer,User > userData=User.data;

    public static void CashWithdraw(){
        User user=userData.get(login.username);
        System.out.println("Enter the amount to Widraw");
        System.out.println("Amount Entered must be of denominations 100,200 & 500");
        double EnteredAmount =dk.nextInt();
        if((EnteredAmount%100==0 || EnteredAmount%200==0 || EnteredAmount%500==0 )&& EnteredAmount<user.getBalance()){
            user.withdraw(EnteredAmount);
            System.out.println("Withdraw Successfull");
            continueTrans.Continue();
        }
        else{
            System.out.println("Insufficient Balance");
            continueTrans.Continue();
        }

    }


    public static void main(String[] args) {
        
    }
}
