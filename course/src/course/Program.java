package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a day of the week: ");
		int d = keyboard.nextInt();
		String day;

		switch (d) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "invalid input";
		}
		
		System.out.println("Day: " + day);

		keyboard.close();
	}

}
