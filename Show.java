import java.util.Scanner;

public class Show {

    static Scanner dk=new Scanner(System.in);

    public static void main(String[] args) {
        Display();
    }

    public static void Display(){
        System.out.println("Select the services");
            System.out.println("1. Balance Check");
            System.out.println("2. Cash Deposit");
            System.out.println("3. Withdarw Cash");
            System.out.println("4. Pin Change");
            System.out.println("5. Exit");
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
                    System.out.println("Exiting....! Thank You");;
                    break;
                default:
                    System.out.println("Service selected is Unavailable");
                    Display();
                    break;
    }
}
}
