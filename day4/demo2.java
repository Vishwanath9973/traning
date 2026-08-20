package day4;
import java.util.HashSet;
public class demo2 {

	public static void main(String[] args) {
	        
	        HashSet<Integer> students = new HashSet<>();
	        students.add(10);
	        students.add(20);
	        students.add(30);
	        students.add(40);
	        students.add(50);
	        int target=70;
	        boolean found = students.contains(target);
	        if (found) {
	            System.out.println("Student " + target + " found!");
	        }else {
	        	System.out.println("Student " + target + " Not found!");
	        }

	}

}
