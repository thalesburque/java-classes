package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.println("Enter account data");

			System.out.print("Number: ");
			int number = keyboard.nextInt();

			System.out.print("Holder: ");
			keyboard.nextLine();
			String holder = keyboard.nextLine();

			System.out.print("Initial balance: ");
			double balance = keyboard.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = keyboard.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = keyboard.nextDouble();
			account.withdraw(withdraw);

			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		finally {
			if(keyboard != null)
				keyboard.close();
		}

	}

}
