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
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		Date birthDate = sdf.parse(date);
		
		Client client = new Client(name, email, birthDate);
		
		System.out.print("Enter order data: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(new Date(), status, client); 
				
		System.out.print("How many items to this order: ");
		int itemQuantity = sc.nextInt();
		
		for(int i = 1; i <= itemQuantity; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			order.addItem(item);	
		}
		
		System.out.println(order);
		
		System.out.print("Remover produto: ");
		sc.nextLine();
		String productName = sc.nextLine();
		
		Product product;
		OrderItem removeItem = new OrderItem();
		for(OrderItem i : order.getItems()) {
			product = i.getProduct();
			
			if(product.getName().equalsIgnoreCase(productName)) {
				removeItem = i;
			}
			
		}
		
		order.removeItem(removeItem);
		
		System.out.println(order);
		
		sc.close();
		
	}

}
