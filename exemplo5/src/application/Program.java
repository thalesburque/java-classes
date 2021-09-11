package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		List<Employee> listOfEmployee = new ArrayList<>();

		System.out.print("Enter number of employees: ");
		int n = keyboard.nextInt();
		keyboard.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			String isOutsourced = keyboard.nextLine();

			System.out.print("Name: ");
			String name = keyboard.nextLine();
			System.out.print("Hours: ");
			int hours = keyboard.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = keyboard.nextDouble();
			keyboard.nextLine();

			if (isOutsourced.charAt(0) == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = keyboard.nextDouble();
				keyboard.nextLine();
				listOfEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				listOfEmployee.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");

		for (Employee aux : listOfEmployee) {
			System.out.println(aux.getName() + " - $ " + String.format("%.2f", aux.payment()));

		}

		keyboard.close();
	}

}
