import java.util.*;

public class AdminDts{
    
    public static HashMap <Integer,AdminDts> Data= new HashMap<>();

    public static void admindata(){
        Data.put(001,new AdminDts(001,111,"David"));
        Data.put(002,new AdminDts(002,222,"Warner"));
    }

    public static void addadmindata(int adminId,int adminpass,String name){
        Data.put(adminId,new AdminDts(adminId,adminpass,name));
       
    }
    
    private int adminId;
    private int adminpass;
    private String name;

    public AdminDts(int adminId,int adminpass,String name){
        this.adminId=adminId;
        this.adminpass=adminpass;
        this.name=name;
    }

    public int getadminId(){
        return adminId;
    }

    public int getPass(){
        return adminpass;
    }

    public String getName(){
        return name;
    }
    

}
