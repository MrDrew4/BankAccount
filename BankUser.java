import java.math.BigDecimal;

public class BankUser {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount("Andrew", "619");
		user1.mainMenu();
		System.out.println("user 1 ");
		user1.getBalance();
		System.out.println();
		System.out.println();

		BankAccount user2 = new BankAccount("Bernie", "3890");
		user2.mainMenu();

	}

}
