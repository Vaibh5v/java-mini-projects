import java.util.*;

class Operator{

void countVowConso(String str){
    int Vowels = 0;
    int Consonents = 0;
    String s= str.toLowerCase();
    for(int i=0; i<str.length();i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
            Vowels++;
        }
        else if(s.charAt(i)==' '){
            continue;
        }
        else{
            Consonents++;
        }
    }

    System.out.println("Vowels: "+ Vowels);
    System.out.println("Consonants: "+Consonents);
    
}

void replaceSpace(String str){
    
    System.out.println("Replacing All spaces with @: " + str.replace(" " , "@"));

}

void UppercaseLowercase(String str){
    System.out.println("Converting to Uppercase: "+ str.toUpperCase());
    System.out.println("Converting to Lowercase: "+ str.toLowerCase());
}

void reverseBuilder(String str){
    
    StringBuilder st = new StringBuilder(str);
    System.out.println("Reversed using StringBuilder: "+ st.reverse());
}



}

public class Experiment3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operator op = new Operator();
    
    System.out.println("Enter String:");
    String str = sc.nextLine();

    int choice;
    sc.nextLine();

    do{
        System.out.println("Menu:");
        System.out.println("1.Count Vowels and Consonents");
        System.out.println("2.Replace space with");
        System.out.println("3.To Uppercase and Lowercase");
        System.out.println("4.Reverse using StringBuilder");
   
        System.out.println("5.Exit");

        System.out.println("Enter Choice");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                op.countVowConso(str);
                break;
        
            case 2:
                op.replaceSpace(str);
           
                break;

            case 3:
                op.UppercaseLowercase(str);
                break;

            case 4:
                op.reverseBuilder(str);
                break;
            
            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Error!");
                break;

        }

    }while(choice!=5);
    

    
    
    
     sc.close();

    }
  
}

