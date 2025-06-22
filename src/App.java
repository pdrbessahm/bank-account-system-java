import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in); // AVOIDING CREATE A LOT OF SCANNERS
    public static void main(String[] args) throws Exception {
       // JAVA BANKING PROGRAM

       // DECLARE VARIABLES 
        // USE TO BE A SCANNER HERE
        double balance = 0; // Because it includes decimal numbers here
        boolean isRunning = true;
        int choice;

        while(isRunning){
        
        // DISPLAY MENU
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
        
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
        
            // SWITCH HERE ITS AN EASIER WAY TO SET THE CHOICE SYSTEM RATHER THAN IF CHAIN CODE    
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE. TYPE AGAIN.");

                }

       }

       // GET AND PROCESS USERS CHOICE

       // deposit()

       // withdraw()

       // EXIT MESSAGE

       
    }
    // showBalance()
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("R$%.2f\n", balance);
    }
    static double deposit(){
        
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        } else {
            return amount;
        }

    }
}
