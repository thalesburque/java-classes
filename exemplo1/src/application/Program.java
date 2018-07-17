package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		int quantity;

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Price: ");
		double price = keyboard.nextDouble();
		System.out.print("Quantity in stock: ");
		quantity = keyboard.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter number of products to be added in stock: ");
		quantity = keyboard.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter number of products to be removed in stock: ");
		quantity = keyboard.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);

		keyboard.close();

	}

}
