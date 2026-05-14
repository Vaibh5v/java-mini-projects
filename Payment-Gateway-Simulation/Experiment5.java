import java.util.*;

interface CardPayment{
    void processCardPayment(String cardNo , double amount , Scanner sc);
    void refundCardPayment(String cardNo);
}

interface UPIPayment{
    public void processUPIPayment(String upiID , double amount , Scanner sc);
    public void refundUPIPayment(String upiID);

}

class PaymentGateway implements CardPayment,UPIPayment{
    long paymentTime;
    long currentTime;
    
    public void processCardPayment(String cardNo, double amount , Scanner sc){
      if(cardNo.length()<16){
        System.out.println("Invalid Card No.!");
        return;
      }
      else if(amount<=0){
        System.out.println("Invalid Amount");
        return;
      }
      else{
        paymentTime = System.currentTimeMillis();
        System.out.println("Payment Successful from card no: "+"XXXX XXXX XXXX "+cardNo.substring(12, 16));

        int choice;
        
      
        System.out.println("Do you want a refund ? [1/0] , confirm within 10 sec from now !");
        choice = sc.nextInt();

        currentTime = System.currentTimeMillis();

        double diff = (currentTime-paymentTime)/1000;

        if(choice==1){
            if(diff<10.00){
            refundCardPayment(cardNo);
            }
            else{
                System.out.println("Time duration exceed , can not refund");
            }
     }
      else{
        return;
      }
        
    }
    
    }
    public void refundCardPayment(String cardNo){
        System.out.println("Payment Successfully refunded to Card no: "+"XXXX XXXX XXXX "+cardNo.substring(12, 16));
    }

    public void processUPIPayment(String upiID , double amount , Scanner sc){
        if(!upiID.contains("@")){
            System.out.println("Invalid UPI ID !");
            return;
        }
        else if( amount<0){
            System.out.println("Invalid ammount !");
            return;
        }
        else{
            paymentTime = System.currentTimeMillis();
            System.out.println("Payment Successful from UPI ID: "+upiID);

            int choice;
            
            
            System.out.println("Do you want a refund ? [1/0] , confirm within 10 sec from now !");
            choice = sc.nextInt();
    
            currentTime = System.currentTimeMillis();
    
            double diff = (currentTime-paymentTime)/1000;
            
            if(choice==1){
                if(diff<10.00){
                    refundUPIPayment(upiID);
                }
                else{
                    System.out.println("Payment can not be refunded , time limit exceed !");
                }
            }
            else{
                return;
            }
           
        }


    }
   
    public void refundUPIPayment(String upiID){
        System.out.println("Payment Successfully refunded to UPI ID: "+upiID);
    }
}

public class Experiment5 {
    public static void main(String[] args) {
    
    PaymentGateway pg = new PaymentGateway();

    Scanner sc = new Scanner(System.in);
    String upiID;
    String cardNo;
    double amount;

    int choice;

    do{
        System.out.println("Menu");
        System.out.println("1.Process Card Payments");
        System.out.println("2.Process UPI Payments");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();
                System.out.println("Enter Amount: ");
                amount = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter Card No: ");                
                cardNo = sc.nextLine();

                pg.processCardPayment(cardNo,amount,sc);

                break;
            case 2:
                sc.nextLine();
                System.out.println("Enter Amount: ");
                amount = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter UPI ID: ");
                upiID = sc.nextLine();

                pg.processUPIPayment(upiID, amount , sc);
                
                break;
            case 3:

                System.out.println("Exiting....");

                break;
            default:
                System.out.println("Invalid Choice !");
                break;
        }


    }while(choice!=3);

    sc.close();
}


}
