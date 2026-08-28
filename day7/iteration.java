package day7;

public class iteration {

	public static void main(String[] args) {
	int amount = 10000;
	int withdrawal = 2000;
	for(int i=1;i<6;i++) {
		amount = amount - withdrawal;
		System.out.println("anter "+i+"withdrawal: "+amount);
	}
	
		

	}

}
