package applicaltion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		List<Shape> listOfShapes = new ArrayList<>();

		System.out.print("Enter number of shapes: ");
		int n = keyboard.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");

			System.out.print("Rectangle or Circle (r/c)? ");
			keyboard.nextLine();
			String shapeType = keyboard.nextLine();

			System.out.print("Color (BLACK/BLUE/RED)? ");
			String color = keyboard.nextLine();

			if (shapeType.charAt(0) == 'c') {
				System.out.print("Radius: ");
				double radius = keyboard.nextDouble();
				listOfShapes.add(new Circle(Color.valueOf(color), radius));
			} else {
				System.out.print("Width: ");
				double width = keyboard.nextDouble();
				System.out.print("Height: ");
				double height = keyboard.nextDouble();
				listOfShapes.add(new Rectangle(Color.valueOf(color), width, height));
			}
		}

		System.out.println();

		System.out.println("SHAPE AREAS");

		for (Shape aux : listOfShapes) {
			System.out.println(String.format("%.2f", aux.area()));
		}

		keyboard.close();
	}

}
