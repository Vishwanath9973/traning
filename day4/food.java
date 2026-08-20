package day4;

import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("pizza");
			break;
		case 2:
			System.out.println("burger");
			break;
		case 3:
			System.out.println("sandwhich");
			break;
		case 4:
			System.out.println("Pasta");
			break;
		case 5:
			System.out.println("Rotti-byali");
			break;
		default:
			System.out.println("Invalid Choice");

	}

}
}
