// Simple Budget Application to calculate your monthly budget

// Libraries
import java.util.Scanner;

public class Budget {

    public static void main(String[] args) {
        
        CreateBudget();
    }

    // Method that handles user input and performs calculations
    public static void CreateBudget()
    {
        // Initialize Variables
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        double billAmount;
        double billTotal = 0;
        double budgetAmount = 0;
        double recAllowance = 0;
        double remainingAmount = 0;
        int moreBills;
        int intBillTotal;

        // Gather all user input
        System.out.println("First enter your total budget allowance: ");
        budgetAmount = scan.nextDouble();

        // Buffer
        System.out.println(" ");

        while (isTrue)
        {
            System.out.println("Enter a bill amount: ");
            billAmount = scan.nextDouble();

            System.out.println("Any other bills? '1' for yes or '2' for no");
            moreBills = scan.nextInt();

            if (moreBills == 1)
            {
                billTotal = billAmount + billTotal;
                System.out.println("Your new total is: " + billTotal);
                isTrue = true;
            }

            else if(moreBills == 2)
            {
                System.out.println("Very good.");
                System.out.println("Calculating your budget....");
                break;
            }

            else
            {
                System.out.println("Error!");
            }

        }

        // Buffer
        System.out.println(" ");

        // Perform budget calculations
        intBillTotal = (int)billTotal;
        remainingAmount = budgetAmount - intBillTotal;
        recAllowance = remainingAmount * .5;

        // Display Results
        System.out.println("----------------------------------");
        System.out.println("*          STATEMENT");
        System.out.println("*");
        System.out.println("* Budget: $" + budgetAmount);
        System.out.println("* Total Bills: $" + intBillTotal);
        System.out.println("* Remaining Amount: $" + remainingAmount);
        System.out.println("* Recommended Allowance: $" + recAllowance);
        System.out.println("----------------------------------");

        // Buffer
        System.out.println(" ");

        // Close the scanner
        scan.close();
    }
    
}
