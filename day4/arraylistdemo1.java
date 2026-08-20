package day4;
import java.util.ArrayList;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("Initial size of ArrayList before adding elements: "+list.size());
		System.out.println("ArrayList is empty before adding value: "+list.isEmpty());
		System.out.println("Content of arraylist before adding value: "+list);
		boolean b1=list.contains("E");
		System.out.println("value E is present: "+b1);
		boolean b2=list.contains("R");
		System.out.println("value E is present: "+b2);
		
		list.remove("B");
		System.out.println();

		
		

	}

}
