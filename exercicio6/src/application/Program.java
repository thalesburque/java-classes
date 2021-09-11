package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		List<TaxPayer> listOfTaxPayer = new ArrayList<>();

		System.out.print("Enter number of tax payers: ");
		int n = keyboard.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");

			System.out.print("Individual or company (i/c)? ");
			keyboard.nextLine();
			String taxPayerType = keyboard.nextLine();

			System.out.print("Name: ");
			String name = keyboard.nextLine();

			System.out.print("Anual income: ");
			double yearIncome = keyboard.nextDouble();

			if (taxPayerType.charAt(0) == 'i') {
				System.out.print("Health expenditures: ");
				double healthPayments = keyboard.nextDouble();
				listOfTaxPayer.add(new Individual(name, yearIncome, healthPayments));
			} else {
				System.out.print("Number of employees: ");
				int numOfEmployees = keyboard.nextInt();
				listOfTaxPayer.add(new Company(name, yearIncome, numOfEmployees));
			}
		}
		
		System.out.println();

		System.out.println("TAXES PAID: ");
		
		double totalTax = 0;
		for (TaxPayer aux : listOfTaxPayer) {
			double tax = aux.tax();
			System.out.println(aux.getName() + ": $ " + String.format("%.2f", aux.tax()));
			totalTax += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));

		keyboard.close();
	}

}
