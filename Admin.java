import java.util.*;

public class Admin {
    
    public static int adminId;
    public static Scanner dk=new Scanner(System.in);
    public static HashMap<Integer,AdminDts> adminData = AdminDts.Data;

    public static void login(){
        System.out.println("Enter the Admin ID");
        adminId = dk.nextInt();
        if(!adminData.containsKey(adminId)){
            System.out.println("Admin ID does not exist");
            return;
        }
        System.out.println("Enter the pass");
        int adminpass= dk.nextInt();
        AdminDts dts=adminData.get(adminId);
        if(adminpass!=dts.getPass()){
            System.out.println("Password Incorrect");
            return;
        }
        Show.adminService();
    }
}