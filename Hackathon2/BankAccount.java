package Hackathon2;
import java.util.Scanner;

class BankAccountManagement {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccountManagement(String accountNumber,String accountHolderName, double balance ){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public double deposit(double amount){
        if (amount>0){
            balance = balance + amount;
        }
        return balance;
    }
    public double withdraw(double amount){
        if(amount<= balance){
            balance = balance - amount;
        }
        return balance;
    }
    public double checkBalance(){
        return balance;
    }
    public void displayAccount(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccount{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account Number:");
        String accNum = scan.next();
        System.out.println("Enter Account Holder name:");
        String name = scan.next();
        System.out.println("Enter Initial Balance:");
        double initialBalance = scan.nextDouble();
        BankAccountManagement account = new BankAccountManagement(accNum, name, initialBalance);
        System.out.println("Enter the Deposit Amount:");
        double depoAmount = scan.nextDouble();
        System.out.println("Enter the Withdrawn Amount:");
        double withAmount = scan.nextDouble();
        account.deposit(depoAmount);
        account.withdraw(withAmount);
        account.displayAccount();
    }
}
