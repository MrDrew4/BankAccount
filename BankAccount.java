import java.util.Scanner;

public class BankAccount {
	private double balance;
	private String userName;
	private String userId;
	private double previousTransaction;

	BankAccount(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
	}

	public void mainMenu() {
		Scanner scan = new Scanner(System.in);
		char userChoice;
		double userAmount;
		System.out.println("Welcome to your bank account " + userName + "!");
		System.out.println("Please choose an action!");
		showMenu();

		userChoice = scan.next().toLowerCase().charAt(0);
		while (userChoice != 'q') {

			if (userChoice == 'd') {
				userAmount = scan.nextDouble();
				setDeposit(userAmount);
			} else if (userChoice == 'w') {
				userAmount = scan.nextDouble();
				setWithdraw(userAmount);
			} else if (userChoice == 'p') {
				previousTransaction();
			} else if (userChoice == 'b') {
				getBalance();
			} else if (userChoice == 'm') {
				showMenu();
			} else if (userChoice == 'i') {
				userInfo();
			} else {
				System.out.println("Please enter a valid action!");
			}
			userChoice = scan.next().toLowerCase().charAt(0);
		}
	}

	public void showMenu() {
		System.out.println("D: Deposit");
		System.out.println("W: Withdraw");
		System.out.println("P: Previous Transaction");
		System.out.println("B: Balance");
		System.out.println("M: Menu");
		System.out.println("I: User Information");
		System.out.println("Q: Quit");
		for (int i = 0; i < 55; i++) {
			System.out.print("*");

		}
		System.out.println();

	}

	public void setDeposit(double amount) {
		balance += amount;
		System.out.println("---------------------------");
		System.out.println("Transaction completed");
		System.out.println("---------------------------");
		previousTransaction = amount;

	}

	public void getBalance() {
		System.out.println("---------------------------");
		System.out.println("Account Balance: " + balance);
		System.out.println("---------------------------");

	}

	public void setWithdraw(double amount) {
		balance -= amount;
		System.out.println("---------------------------");
		System.out.println("Transaction completed");
		System.out.println("---------------------------");
		previousTransaction = -amount;

	}

	public void previousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("---------------------------");
			System.out.println("Amount deposited: " + previousTransaction);
			System.out.println("---------------------------");
		} else if (previousTransaction < 0) {
			System.out.println("---------------------------");
			System.out.println("Amount withdrawn: " + Math.abs(previousTransaction));
			System.out.println("---------------------------");
		}
	}

	public void userInfo() {
		System.out.println("---------------------------");
		System.out.println("Name: " + userName);
		System.out.println("ID Number: " + userId);
		System.out.println("---------------------------");
	}

}
