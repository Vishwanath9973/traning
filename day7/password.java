package day7;

public class password {
	static String correctPassword = "231";
	static void tryPassword(String password) {
		System.out.println("Trying:" + password);
		if (password.equals(correctPassword)) {
			System.out.println("password found:"+password);
					return;
		}
		System.out.println("Wrong password. so back and try another");
	}
	
			

	public static void main(String[] args) {
		tryPassword("123");
		tryPassword("111");
		tryPassword("222");
		tryPassword("231");
		

	}

}
