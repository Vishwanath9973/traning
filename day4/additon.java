package day4;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your choice: ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of n number: "+sum);

	}

}
