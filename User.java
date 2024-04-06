import java.util.*;

public class User {
    public static HashMap<Integer, User> data = new HashMap<>();

    public static void userdata(){
        data.put(1233, new User(1234, 2003, "Dhinesh", 1000.0));
        data.put(1235, new User(1235, 2004, "Indrajith", 1500.0));
    }

    public static void addUser(int username, int password, String name, double balance) {
        data.put(username, new User(username, password, name, balance));
    }
    
    private int username;
    private int password;
    private String name;
    private double balance;

    public User(int username,int password, String name,double balance){
        this.username=username;
        this.password=password;
        this.name=name;
        this.balance=balance;
    }

    public int getUsername() {
        return username;
    }


    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        balance-=amount;
    }

    public void pinchange(int pin) {
        password=pin;
    }

    public void delete(int username){
        data.remove(username);
    }

}
