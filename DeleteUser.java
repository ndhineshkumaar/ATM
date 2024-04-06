import java.util.*;

public class DeleteUser {
    
    public static Scanner dk=new Scanner(System.in);
    public static HashMap<Integer,User> userData= User.data;

    public static void userDelete(){
        System.out.println("Enter the userID for deletion");
        int username=dk.nextInt();
        User user=userData.get(username);
        user.delete(username);
        System.out.println("Deletion Successfull");
        continueTrans.ContinueAd();
    } 
}
