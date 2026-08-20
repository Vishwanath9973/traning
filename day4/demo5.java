package day4;
import java.util.HashSet;
public class demo5 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,50,50};
		HashSet<Integer> set=new HashSet<>();
		for(int number:numbers) {
		
		if(set.contains(number)) {
			System.out.println("Duplicates: "+number);
		}else {
			set.add(number);
		}
	}

	}

}
