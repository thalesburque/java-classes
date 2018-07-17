package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.*;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numOfEmployees = keyboard.nextInt();

		for (int i = 0; i < numOfEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			keyboard.nextLine();
			int id = keyboard.nextInt();
			System.out.print("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.print("Salary: ");
			double salary = keyboard.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter employee ID that will have salary increasement: ");
		keyboard.nextLine();
		int id = keyboard.nextInt();

		Employee aux = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (aux == null) {
			System.out.println("This ID does not exist!");
		} else {
			keyboard.nextLine();
			System.out.print("Enter percentage: ");
			double percentage = keyboard.nextDouble();
			aux.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}

		keyboard.close();
	}

}
