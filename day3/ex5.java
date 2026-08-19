package day3;

public class exc5 {

	public static void main(String[] args) {
		System.out.println("anand");
		System.out.println("anand3");
		System.exit(0);
		
		try {
			int a = 10 / 0;
			System.out.println(a);
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");

	}

}
