package aplicattion;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		Student rooms[] = new Student[10];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\n", (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room] = new Student(name, email);
		}
		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + (": ") + rooms[i]);
			}
		}
		
		sc.close();
	}
}
