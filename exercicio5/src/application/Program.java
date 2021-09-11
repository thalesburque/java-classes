package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> listOfProduct = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = keyboard.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			keyboard.nextLine();
			char productType = keyboard.nextLine().charAt(0);

			System.out.print("Name: ");
			String name = keyboard.nextLine();
			System.out.print("Price: ");
			double price = keyboard.nextDouble();

			if (productType == 'i') {
				System.out.print("Custom fee: ");
				double customFee = keyboard.nextDouble();
				listOfProduct.add(new ImportedProduct(name, price, customFee));
			} else if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				keyboard.nextLine();
				Date manufactureDate = sdf.parse(keyboard.nextLine());
				listOfProduct.add(new UsedProduct(name, price, manufactureDate));
			} else {
				listOfProduct.add(new Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for(Product aux : listOfProduct) {
			System.out.println(aux.priceTag());
		}
		keyboard.close();

	}

}
