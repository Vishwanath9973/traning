package day5;
import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = sc.nextLine();
		int n = s1.length();
		int totalcount= n * (n+1)/2;
		System.out.println("Total number of substring:" + totalcount);
		for (int i = 0; i <=n; i++) {
			for(int j=i +1; j<= n; j++) {
				System.out.println(s1.substring(i, j));
			}
		}
		
	}}
		
		