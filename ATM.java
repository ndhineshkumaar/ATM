import java.util.*;

public class ATM {
    
    static Scanner dk = new Scanner(System.in);

    public static void main(){
        User.userdata();
        System.out.println("Welcome to SBI ATM");
        System.out.println("1. Login");
        System.out.println("2. Create Account");
        System.out.println("3. Show Account");
        System.out.println("4. Exit");
        int choice = dk.nextInt();
        switch (choice) {
            case 1:
                login.userlogin();
                break;
            case 2:
                NewUser.Createacc();;
                break;
            case 3:
                Accounts.showacc();
                break;
            case 4:
                System.out.println("Exiting...! Thank you");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        main();
    }



}
