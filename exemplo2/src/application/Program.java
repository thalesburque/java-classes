package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		String email;
		int room;
		int roomQuantity;
		
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		roomQuantity = keyboard.nextInt();
		
		for(int i = 0; i < roomQuantity; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1));
			
			keyboard.nextLine();			
			System.out.print("Name: ");
			name = keyboard.nextLine();
			
			System.out.print("Email: ");
			email = keyboard.nextLine();
			
			System.out.print("Room: ");
			room = keyboard.nextInt();
			
			rent[room] = new Rent(name, email, room);
		}
		
		
		keyboard.close();
		
	}

}
