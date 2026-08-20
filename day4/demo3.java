package day4;
import java.util.HashSet;
public class demo3 {

	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50};
		HashSet<Integer> set=new HashSet<>();
		for(int number:numbers) {
			set.add(number);
		}
		int target=30;
		if(set.contains(target)) {
			System.out.println("set "+target+" found");
		}else {
			System.out.println("set "+target+" Not found");
		}
		
		

	}

}
