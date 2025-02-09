import java.util.Scanner;

public class Simple_Banking_Program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        int choice;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("======== Banking Program =======");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("=================");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount = 0;
        System.out.print("Enter amount to deposit: ");
        amount = sc.nextDouble();
        if(amount < 0){
            System.out.println("Invalid amount");
            return 0;
        }else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount = 0;
        System.out.print("Enter amount to withdraw: ");
        amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient balance");
            return 0;
        }else if(amount < 0){
            System.out.println("Invalid amount");
            return 0;
        }else{
            return amount;
        }
    }
}
