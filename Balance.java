public class Balance {
    // Declare bal as a class variable
    public static long bal = 2000;

    public static void main(String[] args) {
        // Call BalanceCheck method
        BalanceCheck();
    }

    // Change return type to void
    public static void BalanceCheck() {
        bal=bal+ Deposit.Amnt;
        System.out.println(bal);

        continueTrans.Continue();
        
    }
}
