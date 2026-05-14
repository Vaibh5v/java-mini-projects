import java.util.*;

    class Records{

    void add(HashMap<Integer, String> hm , Scanner sc){

        int id;
        String name;

        System.out.println("Enter the ID of the new employee");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name of the new employee");
        name = sc.nextLine();

        //check if duplicate is being added
        if(hm.containsKey(id)){
            System.out.println("Employee ID already exist");
            return;
        }
        if(hm.containsValue(name)){
            System.out.println("Employee name already exist");
            return;
        }

        //Add the new employee

        hm.put(id,name);
        System.out.println("Employee Successfully added");
        System.out.println(hm.entrySet());

      }

    void update(HashMap<Integer, String> hm , Scanner sc){
        //check if the HashMap is empty 
        if(hm.isEmpty()){
            System.out.println("The HashMap is empty !");
            return;
        }
        int id; 
        String newName;

        System.out.println("Enter the employee ID to be updated");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new Name");
        newName = sc.nextLine();

        //check if the id exists
        if(!hm.containsKey(id)){
            System.out.println("The entered ID does not exist");
            return;
        }

        //update the existing employee by simply using put method 

        hm.put(id,newName);
        System.out.println("The employee record updated successfully");
        System.out.println(hm.entrySet());

    }

    void delete(HashMap<Integer, String> hm , Scanner sc){
        //check if the hashmap is empty
        if(hm.isEmpty()){
            System.out.println("The HashMap is empty !");
            return;
        }
        int id;
        
        System.out.println("Enter the employee ID to be deleted");
        id = sc.nextInt();
        //check if the id exist or not
        if(!hm.containsKey(id)){
            System.out.println("The entered employee dose not exist");
            return;
        }
        //remove the employee id 
        hm.remove(id);
        System.out.println("The Employee with ID: "+id+" removed successfully !");
        System.out.println(hm.entrySet());

    }

    void search(HashMap<Integer, String> hm , Scanner sc){
        //check if the HashMap is empty or not 
        if(hm.isEmpty()){
            System.out.println("The HashMap is empty !");
            return;
        }

        int id;
        System.out.println("Enter the employee ID to search");
        id = sc.nextInt();
        //check if the id exists or not 
        if(!hm.containsKey(id)){
            System.out.println("No such ID Exists ");
            return;
        }

        System.out.println("The Employee Found Successfully !");
        System.out.println("ID: "+id+" Name: "+hm.get(id));

    }

    void sort(HashMap<Integer, String> hm , Scanner sc){

        if(hm.isEmpty()){
            System.out.println("The HashMap is empty !");
            return;
        }
        
        ArrayList<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(hm.entrySet());

        Collections.sort(list,(e1,e2) ->e1.getValue().compareTo(e2.getValue()));

        System.out.println("The employees in Alphabetical Order");
        for (Map.Entry<Integer,String> entry : list) {
            System.out.println("ID: "+ entry.getKey()+" Name: "+entry.getValue());
        }

    }


}

public class Experiment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        Records re = new Records();

         
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1.Add new Employee");
            System.out.println("2.Update existing Employee");
            System.out.println("3.Delete existing Employee");
            System.out.println("4.Search Employee");
            System.out.println("5.Sort the Employees according to the name");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    re.add(hm, sc);
                    break;
                case 2:
                    re.update(hm, sc);
                    break;
                case 3:
                    re.delete(hm, sc);
                    break;
                case 4:
                    re.search(hm, sc);
                    break;
                case 5:
                    re.sort(hm, sc);
                    break;
                case 6:
                    System.out.println("Exiting....");
                default:
                    System.out.println("Invalid choice !");
                    break;
            }

        }while(choice!=6);



        sc.close();
    }

}
