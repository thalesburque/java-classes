package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		int number;
		String holder;
		double initialDeposit;
		double amount;
		char response;
		Account account;

		System.out.print("Enter account number: ");
		number = keyboard.nextInt();
		System.out.print("Enter account holder: ");
		keyboard.nextLine();
		holder = keyboard.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		response = keyboard.next().charAt(0);

		if (response == 'y') {

			System.out.print("Enter initial deposit value: ");
			initialDeposit = keyboard.nextDouble();
			account = new Account(number, holder, initialDeposit);

		} else {

			account = new Account(number, holder);

		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = keyboard.nextDouble();
		account.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = keyboard.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);

		keyboard.close();

	}

}
