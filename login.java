import java.util.*;

public class login{
    
    static Integer username;
    static Scanner dk = new Scanner(System.in);
    static HashMap<Integer,User> userData = User.data;

    public static void userlogin(){
        System.out.println("Enter Username");
        username= dk.nextInt();
        if(!userData.containsKey(username)){
            System.out.println("Username Does not Exist");
            return;
        }
        System.out.println("Enter Password");
        Integer enteredPassword = dk.nextInt();
        User user =userData.get(username);
        if (enteredPassword==(user.getPassword())) {
            System.out.println("Login Successful");
            System.out.println("Welcome, " + user.getName());
            Show.Display();
        } else {
            System.out.println("Incorrect Password");
        }
    }
}
