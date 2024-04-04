import java.util.Scanner;
  


class main{

    public static short pin;
    public static void main(String[] args) {
        Scanner dk=new Scanner(System.in);
        pin=2003;
        System.out.println("Welcome to SBI ATM");
        System.out.println("Enter the pin to avail the services");
        short EnteredPin=dk.nextShort();
        if(EnteredPin==pin){
            Show.Display();
        }
        else {
            System.out.println("Pin entered is incorrect");
        }
    }
}