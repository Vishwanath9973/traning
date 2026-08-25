package day5;
import java.util.HashSet;
public class hashset1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("Initial size of HashSet before adding elements:" + set.size());
		System.out.println("HashSet is empty before adding values: " + set.isEmpty());
		System.out.println("contents of HashSet before adding values:" + set);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.add(null);
		System.out.println("Size of HashSet after adding elements:" + set.size());
		System.out.println("HashSet is empty after adding values:" + set.isEmpty());
		System.out.println("Contents of HashSet after adding values:" + set);
		boolean b1 = set.contains("E");
		System.out.println("value is present:" + b1);
		boolean b2 = set.contains("R");
		System.out.println("value R is present:" + b2);
		set.remove("B");
		System.out.println("size of HasshSet after deletion:" + set.size());
		System.out.println("contents of HashSet after clearing: " + set);

	}




	}

