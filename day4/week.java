package day4;
import java.util.Scanner;
public class week {

	public static void main(String[] args) {
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednsday");
			break;
		case 5:
			System.out.println("Thrusday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("Invalid day");
		// TODO Auto-generated method stub

	}
	}}
