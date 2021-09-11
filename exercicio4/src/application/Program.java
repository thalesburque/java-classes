package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Email: ");
		String email = keyboard.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(keyboard.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(keyboard.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int n = keyboard.nextInt();
		keyboard.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" +i + " item data: ");
			System.out.print("Product name: ");
			String productName = keyboard.nextLine();
			System.out.print("Product price: ");
			double price = keyboard.nextDouble();
			System.out.print("Quantity: ");
			int quantity = keyboard.nextInt();
			keyboard.nextLine();

			Product product = new Product(productName, price);

			OrderItem item = new OrderItem(quantity, price, product);

			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		keyboard.close();
	}

}
