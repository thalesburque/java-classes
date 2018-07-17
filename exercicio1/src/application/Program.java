package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		/*
		 * programa retangulo Rectangle program Rectangle rectangle = new Rectangle();
		 * 
		 * System.out.println("Enter rectangle width and height: "); rectangle.width =
		 * keyboard.nextDouble(); rectangle.height = keyboard.nextDouble();
		 * 
		 * System.out.println(rectangle);
		 */

		/*
		 * programa funcionario Funcionario funcionario = new Funcionario(); double
		 * percentage;
		 * 
		 * System.out.print("Name: "); funcionario.name = keyboard.nextLine();
		 * System.out.print("Gross Salary: "); funcionario.grossSalary =
		 * keyboard.nextDouble(); System.out.print("Tax: "); funcionario.tax =
		 * keyboard.nextDouble();
		 * 
		 * funcionario.netSalary();
		 * 
		 * System.out.println(); System.out.println("Employee: " + funcionario);
		 * 
		 * System.out.println();
		 * System.out.print("Which percentage to increase salary: "); percentage =
		 * keyboard.nextDouble(); funcionario.increaseSalary(percentage);
		 * 
		 * System.out.println(); System.out.println("Updated data: " + funcionario);
		 */

		/*
		 * programa student Student student = new Student();
		 * 
		 * student.name = keyboard.nextLine(); student.grade1 = keyboard.nextDouble();
		 * student.grade2 = keyboard.nextDouble(); student.grade3 =
		 * keyboard.nextDouble();
		 * 
		 * student.finalGrade();
		 * 
		 * System.out.println(); System.out.println(student);
		 */

		System.out.print("What's dollar price? ");
		double dollarPrice = keyboard.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarQuantity = keyboard.nextDouble();

		System.out.printf("Amount to be paid in BRL = %.2f%n",
				CurrencyConverter.calcCurrency(dollarPrice, dollarQuantity));

		keyboard.close();
	}

}
