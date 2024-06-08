package package_interface;

import java.util.Scanner;

interface MyAccount {
    void depositOfMoney(int amount);
    void withdrawalOfMoney(int amount);
}

class BankAccount implements MyAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }
    
    public void depositOfMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for deposit.");
            return;
        }

        this.balance += amount;
        System.out.println(amount + " successfully deposited. Current balance: " + this.balance);
    }

    public void withdrawalOfMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount for withdrawal.");
            return;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }

        this.balance -= amount;
        System.out.println(amount + " successfully withdrawn. Current balance: " + this.balance);
    }

    public int getBalance() {
        return this.balance;
    }
}

public class q1 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Scanner s = new Scanner(System.in);
		int ch = 0;
		while(ch<3) {
		System.out.println("______________________________");
		System.out.println("Menu");
		System.out.println("1.Deposit money");
		System.out.println("2.Withdraw money");
		System.out.println("3.Current Balance");
		System.out.println("4.Exit");
		System.out.println("\nChoose an option: ");
		
		ch = s.nextInt();
		switch(ch) {
		case 1:
		//Deposit money
		System.out.println("Enter the amount you want to deposit: ");
		account.depositOfMoney(s.nextInt());
		break;
		case 2:
        // Withdraw money
		System.out.println("Enter the amount you want to withdraw: ");
        account.withdrawalOfMoney(s.nextInt());
        break;
		case 3:
        // Display current balance
        System.out.println("Current balance: " +account.getBalance());
        break;
        default:
        	System.out.println("Exiting the program");
		}
		}s.close();
}
}