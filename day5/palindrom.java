package day5;
import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter String");
	        String s = sc.nextLine();
	        
	        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not a palindrome");
}}
		
		
		
		


