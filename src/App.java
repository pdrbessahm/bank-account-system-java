import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // JAVA BANKING PROGRAM

       // DECLARE VARIABLES 
        Scanner scanner = new Scanner(System.in); 
        double balance; // Because it includes decimal numbers here
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
                case 1 -> System.out.println("SHOW BALANCE");
                case 2 -> System.out.println("DEPOSIT");
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE. TYPE AGAIN.");

                }

       }

       // GET AND PROCESS USERS CHOICE

       // showBalance()

       // deposit()

       // withdraw()

       // EXIT MESSAGE

       scanner.close();
    }
}
