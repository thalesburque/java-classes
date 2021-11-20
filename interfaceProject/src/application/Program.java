package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Enter contract data");

			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Date (dd/MM/yyyy): ");
			sc.nextLine();
			Date date = sdf.parse(sc.nextLine());

			System.out.print("Contract value: ");
			double totalValue = sc.nextDouble();

			Contract contract = new Contract(number, date, totalValue);

			System.out.print("Enter number of installments: ");
			int months = sc.nextInt();

			ContractService contractService = new ContractService(new PaypalService());

			contractService.processContract(contract, months);

			System.out.println("Installments: ");

			for (Installment i : contract.getInstallments()) {
				System.out.println(i.toString());
			}

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
