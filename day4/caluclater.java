package day4;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int a=4;
		int b=2;
		
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("addition: "+(a+b));
			break;
		case 2:
			System.out.println("substraction: "+(a-b));
			break;
		case 3:
			System.out.println("multiplication: "+(a*b));
			break;
		case 4:
			System.out.println("division: 1"+(a/b));
			break;
			
		}

	}

}
