import java.util.HashMap;
import java.util.Scanner;

public class Show {

    static Scanner dk=new Scanner(System.in);
    public static HashMap<Integer,User> userData =User.data;

    public static void Display(){
        User user=userData.get(login.username);
        System.out.println("Select the services");
            System.out.println("1. Balance Check");
            System.out.println("2. Cash Deposit");
            System.out.println("3. Withdarw Cash");
            System.out.println("4. Pin Change");
            System.out.println("5. Switch Account");
            System.out.println("6. Exit");
            int services=dk.nextInt();
            switch (services) {
                case 1:
                    Balance.BalanceCheck();
                    break;
                case 2:
                    Deposit.AmntDeposit();
                    break;
                case 3:
                    Withdraw.CashWithdraw();
                    break;
                case 4:
                    Pin.Pinchange();
                    break;
                case 5:
                    System.out.println("Thank You"+" "+ user.getName());
                    login.userlogin();
                    break;
                case 6:
                    System.out.println("Exiting.....! Thank You");
                    login.userlogin();
                    break;
                default:
                    System.out.println("Service selected is Unavailable");
                    Display();
                    break;
    }
}
}
