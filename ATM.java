import java.util.*;

public class ATM {
    
    static Scanner dk = new Scanner(System.in);

    public static void main(){
        User.userdata();
        AdminDts.admindata();
        System.out.println("Welcome to SBI ATM");
        System.out.println("1. Admin Login");
        System.out.println("2. User Login");
        System.out.println("3. Exit");
        int choice = dk.nextInt();
        switch (choice) {
            case 1:
                Admin.login();
                break;
            case 2:
                login.userlogin();
                break;
            case 3:
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
