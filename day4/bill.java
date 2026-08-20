package day4;

public class bill {

	public static void main(String[] args) {
		int units[]= {10,15,12,20,18,14,16};
		int Totalbill=0;
		for(int i=0;i<=4;i++) {
			Totalbill=Totalbill+units[i];	
		}
		System.out.println(" total electricity consumption for 7 days:  "+Totalbill);

	}

}
