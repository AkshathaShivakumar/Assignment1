package Assignments.Assignment1.Module3;


/*Create a class BankAccount with attributes accountNumber and balance, and methods
deposit and withdraw. Use encapsulation.
 */

public class BankAccount {
    private int accountNumber;
    private double balance;


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Updated balance: "+balance);
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Balance insufficient");
            return;
        }
        balance-=amount;
        System.out.println("Updated balance: "+balance);

    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount(7785690,45000);
//        System.out.println(b1.getAccountNumber());
//        System.out.println(b1.getBalance());

        b1.deposit(5000);
        b1.withdraw(25000);

    }



}
