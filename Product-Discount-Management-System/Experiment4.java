import java.util.*;

class Product{
   
    int productID;
    String name;
    double price;
 
    Product(int productID,String name, double price){
        this.productID=productID;
        this.name=name;
        this.price=price;

    }
    
    void discount(){
       //5% common discount
       
        price = price - 0.05*price;
     }


}

class Electronics extends Product{
    
    int warrentyPeriod;

    Electronics(int productID,String name, double price, int warrentyPeriod){
    super( productID,name,price);
    this.warrentyPeriod=warrentyPeriod;

    }

    void discount(){
    super.discount();
    //10% category discount
    System.out.println("Applying 5% and 10% discount");
    price = price - 0.10*price;
    }

    void display(){
        System.out.println("Product Id: "+ productID);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Warrenty period: "+ warrentyPeriod);

}
}

class Clothing extends Product{

    String size;

    Clothing(int productID,String name, double price,String size){
    super( productID,name,price);
    this.size=size;

    }

    void discount(){
    super.discount();
    //15% category discount
    System.out.println("Applying 5% and 15% discount");
    price = price - 0.15*price;
    
    }

    void display(){
        System.out.println("Product Id: "+ productID);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("size: "+ size);

}
  

}

class Groceries extends Product{

    String expiryDate;

    Groceries(int productID,String name, double price,String expiryDate){
    super( productID,name,price);   
    this.expiryDate=expiryDate;   
    }

    void discount(){
    super.discount();
    //20% category discount
    System.out.println("Applying 5% and 10% discount");
    price = price - 0.20*price;

    }

    void display(){
        System.out.println("Product Id: "+ productID);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Expiry date: "+expiryDate );

}


}

public class Experiment4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Electronics el = new Electronics(1, "Mobile", 5000,10);
        Clothing cl = new Clothing(2, "Shirt", 700, "M");
        Groceries gr = new Groceries(3, "Sugar", 70, "SEP-26" );

        int choice;

        do{
            
            System.out.println("Menu");
            System.err.println("1.Electronics");
            System.out.println("2.Apply Discount on electronics");
            System.out.println("3.Clothing");
            System.out.println("4.Apply Discount on Clothing");
            System.out.println("5.Groceries");
            System.out.println("6.Apply Discount on Groceries");
            System.out.println("7.Exit");
            System.out.println("Enter choice");

            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    el.display();
                    break;
                case 2:
                    el.discount();
                    el.display();
                    break;
                case 3:
                    cl.display();
                    break;
                case 4:
                    cl.discount();
                    cl.display();
                    break;
                case 5:
                    gr.display();
                    break;
                case 6:
                    gr.discount();
                    gr.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }

        }while(choice!=7);
     


        sc.close();
    }

}
