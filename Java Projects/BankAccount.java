import java.util.Scanner;

class Account {
    private int balance = 50000;

    public void Withdraw(int wthdr) {
        if(wthdr>0 && wthdr<=balance){
            balance -= wthdr;
            System.out.println("Withdrawal Successful!");
            System.out.println("\nYour updated account balance is: " + balance);
        }
        else if(wthdr>balance){
            System.out.println("Insufficient balance!");
        }
        else{
            System.out.println("Negative balance isn't accepted or valid.");
        }
    }

    public void Deposit(int dep) {
        if(dep>0){
        balance += dep;
        System.out.println("Deposit Successful!");
        System.out.println("\nYour updated account balance is: " + balance);
        }
        else{
            System.out.println("Negative balance isn't accepted or valid.");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, deposit, withdraw;
        Account ac = new Account();

        System.out.println("-: Welcome to Bank :-");
        do{
        System.out.println("\n1. Withdraw Money\n2.Deposit Money\n3. Exit");
        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("\nEnter the amount to withdraw: ");
            withdraw = sc.nextInt();
            ac.Withdraw(withdraw);
        } else if(choice==2) {
            System.out.print("\nEnter the amount to deposit: ");
            deposit = sc.nextInt();
            ac.Deposit(deposit);
        }
        else{
            System.out.println("Exiting...");
        }
    }while(choice!=3);
    }
}
