import java.util.*;

class Sorting{

    void sortIntAsc(Integer[] intarr){
        Arrays.sort(intarr);
        System.out.println(Arrays.toString(intarr));
    }
    
    void sortIntDec(Integer[] intarr){
        Arrays.sort(intarr,Collections.reverseOrder());
        System.out.println(Arrays.toString(intarr));
    }

    void sortStrAsc(String[] strarr){
        Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));

    }

    void sortStrDec(String[] strarr){
        Arrays.sort(strarr , Collections.reverseOrder());
        System.out.println(Arrays.toString(strarr));
    }

}
public class Experiment2 {
    public static void main(String args[]){

        Sorting so = new Sorting();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Int Array Size:");
        int size1=sc.nextInt();
        System.out.println("Enetr String Array Size:");
        int size2=sc.nextInt();
        
        Integer[] intarr = new Integer[size1];
        String[] strarr = new String[size2];

        System.out.println("Enetr Int array elements");

        for(int i=0;i<size1;i++){
            intarr[i]=sc.nextInt();
        }

        sc.nextLine();
        System.out.println("Enter String Array elements");

        for(int i=0;i<size2;i++){
            strarr[i]=sc.nextLine();
        }
        
        int choice;
        sc.nextLine();
        do{
       

        System.out.println("1.Sort IntArray Ascending");
        System.out.println("2.Sort IntArray Descending");
        System.out.println("3.Sort String Array Ascending");
        System.out.println("4.Sort String Array Descending");
        System.out.println("5.Exiting");
        System.out.println("Enter choice");
        choice=sc.nextInt();

        switch(choice){
            case 1:
                 so.sortIntAsc(intarr);
            break;

            case 2:
                so.sortIntDec(intarr);
            break;

            case 3:
                so.sortStrAsc(strarr);
            break;

            case 4:
                so.sortStrDec(strarr);
            break;

            case 5:
                System.out.println("Exiting...");

            break;

            default:
                System.out.println("Error");
            break;
        }


        }while(choice!=5);

        sc.close();

    }

}
