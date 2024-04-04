import java.util.Scanner;

public class Pin {
    
    public static Scanner dk=new Scanner(System.in);
    
    public static void Pinchange(){
        System.out.println("Enter the Current Pin");
        short oldPin=dk.nextShort();
        if (oldPin == main.pin){
            System.out.println("Enter the new Pin");
            short newPin=dk.nextShort();
            System.out.println("Renter the new Pin");
            short newPina=dk.nextShort();
            if(newPin==newPina){
                main.pin=newPin;
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
