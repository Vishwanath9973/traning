package day10;

public class greddy5 {
	public static void main(String[] args) {
	double[] start = {9.00,9.30,10.00,11.00,11.30};
	double[] end = {10.00,11.00,11.00,12.00,1.00};
	
	double lastEnd = end[0];
	
	System.out.println("selected Activity: A");
	
	for (int i = 1; i< start.length;i++) {
		if(start[i]>= lastEnd) {
			System.out.println("Selected Activity:" + (char) ('A' + i));
			lastEnd = end[i];
		}
	}
	}
}
