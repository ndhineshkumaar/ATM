import java.util.HashMap;

public class Balance {
    
    public static HashMap<Integer,User> userData=User.data;

    public static void main(String[] args) {
        // Call BalanceCheck method
        BalanceCheck();
    }

    // Change return type to void
    public static void BalanceCheck() {
       User user=userData.get(login.username);
       System.out.println(user.getBalance());
       continueTrans.Continue();
        
    }
}
