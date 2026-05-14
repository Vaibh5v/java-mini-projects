import java.util.Scanner;

class Calculator {
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println(a + b);
    }

    void subtraction() {
        System.out.println(a - b);
    }

    void remainder() {
        System.out.println(a % b);
    }

    void multiply() {
        System.out.println(a * b);
    }

    void divide() {
        if (b == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println(a / b);
    }
}

class Experiment1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        Calculator ca = new Calculator(a, b);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Remainder");
            System.out.println("6 Exit");

            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1: ca.add(); break;
                case 2: ca.subtraction(); break;
                case 3: ca.multiply(); break;
                case 4: ca.divide(); break;
                case 5: ca.remainder(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Error");
            }

        } while (choice != 6);

        sc.close();
    }
}