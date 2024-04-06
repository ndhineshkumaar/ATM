import java.util.*;

class Accounts{

    public static HashMap<Integer,User> userData=User.data;

    public static void showacc(){

        

        for(Integer i: userData.keySet()){
            User user=userData.get(i);
            System.out.println(user.getName() +" "+ i);
        }
        continueTrans.ContinueAd();

    }
}