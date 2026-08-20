package day4;

public class highest {

	public static void main(String[] args) {
		int units[]= {78,65,89,92,71};
		int highest=units[0];
		for(int i=0;i<=4;i++) {
			if(units[i]>highest) {
				highest=units[i];
				
			}
			
		}
		System.out.println("Highest Marks: "+highest);


	}

}
