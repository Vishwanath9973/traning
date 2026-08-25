package day5;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		System.out.println("Initial size of HashSet before adding elements:" + set.size());
		System.out.println("HashSet is empty before adding values: " + set.isEmpty());
		System.out.println("contents of HashSet before adding values:" + set);

		
		set.add("0");
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
		set.add("7");
		set.add("8");
		set.add("9");

		System.out.println("Size of HashSet after adding elements:" + set.size());
		System.out.println("HashSet is empty after adding values:" + set.isEmpty());
		System.out.println("Contents of HashSet after adding values:" + set);

		boolean b1 = set.contains("E");
		System.out.println("value is present:" + b1);
		boolean b2 = set.contains("R");
		System.out.println("value R is present:" + b2);

		set.remove("1");
		System.out.println("size of HashSet after deletion:" + set.size());
		System.out.println("contents of HashSet after deletion: " + set);

		
		System.out.println("Iterating HashSet using Iterator:");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}