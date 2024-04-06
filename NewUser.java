import java.util.*;

public class NewUser {

    public static Scanner dk=new Scanner(System.in);
    public static void Createacc(){

        System.out.print("Enter Username: ");
        int username=dk.nextInt();
        System.out.print("Enter Name: ");
        String name=dk.nextLine();
        String nam=dk.nextLine();
        System.out.print("Enter Password: ");
        int pass=dk.nextInt();
        System.out.print("Enter Balance: ");
        int bal=dk.nextInt();
        
        User.addUser(username, pass, name, bal);
        System.out.println("User Added Successfully");
        continueTrans.ContinueAd();

    }
    
}
