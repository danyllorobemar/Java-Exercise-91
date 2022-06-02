package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int roomsRented = sc.nextInt();
		
		Rent[] rent = new Rent[10];
		
		for(int i = 1; i <= roomsRented; i++) {
			System.out.println("Rent #" + i +":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email, room); 		
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < rent.length; i++) {
			if(rent[i] != null ) {
				System.out.println(rent[i]);
			}
		}
		
		
		sc.close();

	}

}
