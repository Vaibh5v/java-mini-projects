import java.util.*;

class InvalidCredentialsException extends Exception{

    InvalidCredentialsException(String messageString){
        super(messageString);

    }

}

public class Experiment6 {
    static String userID = "vaibhavgaikar";
    static String passWord = "gaikar@9322";

    static void userLogin(String uid , String pword ) throws InvalidCredentialsException {
       
        if(uid == null || pword == null){
            throw new NullPointerException("Username or Password cannot be null");
        }
        else if(!uid.equals(userID) || !pword.equals(passWord)){
            throw new InvalidCredentialsException("Invalid UserID or Password !");
        }
       
        else if(uid.equals(userID) && pword.equals(passWord)){
            System.out.println("Login Successful !");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String uid;
        String pword;
        System.out.println("Enter UserID :");
        uid = sc.nextLine();
        System.out.println("Enter PassWord");
        pword = sc.nextLine();

        try{

            userLogin(uid,pword );

        }catch(InvalidCredentialsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("Programm Ended !");
           
        }
        sc.close();
    }
    
}
