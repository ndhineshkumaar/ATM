import java.util.Scanner;

public class continueTrans {

    public static Scanner dk=new Scanner(System.in);

    public static void Continue() {
        System.out.println("Do you want to continue (Y/N)");
        String temp=dk.next();
        char ch=temp.charAt(0);
        if(ch=='Y' || ch=='y' ){
            Show.Display();
        }else{
            System.out.println("Thank you");
        }

    }

    public static void ContinueAd() {
        System.out.println("Do you want to continue (Y/N)");
        String temp=dk.next();
        char ch=temp.charAt(0);
        if(ch=='Y' || ch=='y' ){
            Show.adminService();
        }else{
            System.out.println("Thank you");
        }

    }
    public static void main(String[] args) {
        
    }

}
