package day7;
import java.util.Scanner;
public class password2 {

	public static void main(String[] args) {
		String correctPassword="123";
		 Scanner sc =new Scanner(System.in);
	     System.out.println("Enter Password: ");
	     String password=sc.nextLine();
	     if(password.equals(correctPassword)) {
	    	 System.out.println("password is correct");
	     }else {
	    	 System.out.println("password is not correct");
	    	 
	     }
		
	}

}
