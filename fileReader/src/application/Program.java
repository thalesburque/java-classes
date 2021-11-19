package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFileStr = "C:\\temp\\in\\source.csv";
		List<Product> productList = new ArrayList<>();

		File path = new File(sourceFileStr);
		String sourceFolderStr = path.getParent();

		boolean mkdir = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println("Directory created successfully: " + mkdir);

		String targetFileStr = sourceFolderStr + "\\out\\summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String sourceFileLine = br.readLine();
			while (sourceFileLine != null) {
				String[] fields = sourceFileLine.split(",");

				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);

				productList.add(new Product(name, price, quantity));

				sourceFileLine = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product product : productList) {
					bw.write(product.getName() + "," + String.format("%.2f", product.getTotal()));
					bw.newLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
