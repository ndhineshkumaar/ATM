import java.util.HashMap;
import java.util.Scanner;

public class Show {

    static Scanner dk=new Scanner(System.in);
    public static HashMap<Integer,User> userData =User.data;
    public static HashMap<Integer,AdminDts> adminData =AdminDts.Data;

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
                    break;
                default:
                    System.out.println("Service selected is Unavailable");
                    Display();
                    break;
    }

    
}
    public static void adminService(){
        AdminDts dts= adminData.get(Admin.adminId);
        System.out.println("Welcome" +" "+ dts.getName());
        System.out.println("Select the services");
            System.out.println("1. Add User Account");
            System.out.println("2. Show User Account");
            System.out.println("3. Delete User Account");
            System.out.println("4. Exit");
            int ch=dk.nextInt();
            switch(ch){
                case 1:
                    NewUser.Createacc();
                    break;
                case 2:
                    Accounts.showacc();
                    break;
                case 3:
                    DeleteUser.userDelete();
                    break;
                default:
                    System.out.println("Incorrect Selection");
                    break;
        }
    }
}
