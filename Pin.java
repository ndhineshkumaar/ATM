import java.util.HashMap;
import java.util.Scanner;

public class Pin {
    
    public static HashMap<Integer,User> userData=User.data;
    public static Scanner dk=new Scanner(System.in);
    
    public static void Pinchange(){
        User user=userData.get(login.username);
        System.out.println("Enter the Current Pin");
        int oldPin=dk.nextShort();
        if (oldPin ==user.getPassword() ){
            System.out.println("Enter the new Pin");
            int newPin=dk.nextShort();
            System.out.println("Renter the new Pin");
            int newPina=dk.nextShort();
            if(newPin==newPina){
                user.pinchange(newPin);
                System.out.println("Pin Changed Successfully");
                continueTrans.Continue();
            }
            else{
                System.out.println("Pin Mistmatch");
                Pinchange();
            }
        }
        else{
            System.out.println("Pin Enterd does not matches the Current Pin");
            Pinchange();
        }
    }
}
