import java.util.*;

class Product {
    int ID;
    String name;
    double price;

    Product(int ID, String name, double price){
        this.ID=ID;
        this.name=name;
        this.price=price;
    }
    
    public String toString(){
        return "ID:"+ID + " Name:"+name + " Price:"+price;
    }

}

class Inventory{

    void addProduct(ArrayList<Product> al , Scanner sc){
        int ID;
        String name;
        double price;
        

        System.out.println("Enter ID:");
        ID = sc.nextInt();
        //Duplicate Check
        for(Product p : al){
            if(p.ID == ID){
                System.out.println("ID already exist !");
                return;
            }
        }
        sc.nextLine();
        System.out.println("Enter name:");
        name = sc. nextLine();
        System.out.println("Enter price:");
        price = sc.nextDouble();

        al.add(new Product(ID,name,price));
        System.out.println("New Product Added");
        System.out.println(al);

    }

    void updatePrice(ArrayList<Product> al ,  Scanner sc){
        int id;
        System.out.println("Enter ID:");
        id = sc.nextInt();
        //empty check
        if(al.isEmpty()){
            System.out.println("ArrayList is Empty !");
            return;
        }
        //Check if id exist
        boolean present = false;
        for (Product p: al) {
            if(p.ID == id) {
                present = true;
            }
        }
        if(!present){
            System.out.println("No Product Exist with such ID !");
            return;
        }
        //update price
        sc.nextLine();
        double newprice;
        System.out.println("Enter new Price !");
        newprice = sc.nextDouble();

        for(Product p : al){
            if(p.ID==id){
                p.price=newprice;
                System.out.println("Price Updated !");
            }
        }


        System.out.println(al);
    }

    void removeProduct(ArrayList<Product> al ,  Scanner sc){
        int id;
        System.out.println("Enter ID");
        id = sc.nextInt();

        //Check if empty

        if(al.isEmpty()){
            System.out.println("ArrayList is empty !");
            return;
        }
        //Check if ID present 

        for(Product p: al){
            if(p.ID==id){
                al.remove(p);
                System.out.println("Product removed Successfully !");
                System.out.println(al);
                return;
            }
        }
        //If id not present
        System.out.println("No Product with such ID");


    }

    void sortPrice(ArrayList<Product> al){
        
        Comparator<Product> com = (a,b)->((a.price>b.price)?1:-1);
        Collections.sort(al,com);
        System.out.println(al);
    
       //This logic also you can use

       /* Collections.sort(al,(a,b)->(a.price>b.price)?1:-1);
        System.out.println("ArrayList Successfully Sorted by price:");
        System.out.println(al);
        */ 
    }

    void sortName(ArrayList<Product> al){
        
        
      
        Collections.sort(al,(a,b)->a.name.compareTo(b.name));
        System.out.println("ArrayList Successfully Sorted by name:");
        System.out.println(al);
        
}
}

public class Experiment7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        ArrayList<Product> al = new ArrayList<Product>();
        Inventory in = new Inventory();

        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1.Add Product");
            System.out.println("2.Uptate Price");
            System.out.println("3.Remove Product");
            System.out.println("4.Sort by Price");
            System.out.println("5.Sort by Name");
            System.out.println("6.Exit");
            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    in.addProduct(al, sc);
                    break;
                case 2:
                    in.updatePrice(al, sc);
                    break;
                case 3:
                    in.removeProduct(al, sc);
                    break;
                case 4:
                    in.sortPrice(al);
                    break;
                case 5:
                    in.sortName(al);
                    break;
                case 6:
                    System.out.println("Exiting....");
                    break;
                
                default:
                    System.out.println("Invalid choice");
                    break;
            }



        }while(choice!=6);

        sc.close();
    }   
}


