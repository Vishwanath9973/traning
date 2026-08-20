package day4;

public class demo1 {

	public static void main(String[] args) {
		int n = 1500;
		int[] students = new int[n];
		for (int i = 0; i < n; i++) {
		    students[i] = i + 1;
		}
		int target = 1000;
		boolean found = false;
		for (int i = 0; i < n; i++) {
		    if (students[i] == target) {
		        found = true;
		        System.out.println("Found at index " + i);
		        break;
		    }
		}
		if (!found) {
		    System.out.println("Not found");
		}

	}

}
