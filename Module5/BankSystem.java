package Assignments.Assignment2.Module5;

// 1. Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankSystem {

    // 2. Using 'throws' in the method signature to warn callers
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: $" + amount);
        
        if (amount > balance) {
            // 3. Using 'throw' to trigger the exception if logic fails
            throw new InsufficientFundsException("Error: You don't have enough money! Current balance: $" + balance);
        }
        
        System.out.println("Withdrawal successful! Remaining: $" + (balance - amount));
    }

    public static void main(String[] args) {
        double myBalance = 500.00;

        try {
            // Test 1: Successful withdrawal
            withdraw(myBalance, 200.00);
            
            System.out.println("---");

            // Test 2: This will trigger the exception
            withdraw(myBalance, 800.00);

        } catch (InsufficientFundsException e) {
            // Handling our custom exception
            System.err.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("---");
            System.out.println("Thank you for using our ATM.");
        }
    }
}